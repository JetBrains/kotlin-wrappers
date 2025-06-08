package karakum.cesium

private val OPTIONS_REGEX = Regex("""(options|apiOptions)\??: (\{.+})""", RegexOption.DOT_MATCHES_ALL)
private val INNER_OPTIONS_REGEX = Regex("""(\w+\??): \{.+?}""", RegexOption.DOT_MATCHES_ALL)

// WA for Cesium `1.105.0`
// GeocoderViewModel
private val DESTROY = """
    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     */
    destroy(): void;
""".trimEnd()


internal fun members(
    body: String,
    optionsDoc: String,
): List<Member> {
    if (body.endsWith("{\n}"))
        return emptyList()

    if (DESTROY in body && body.count(DESTROY) > 1) {
        return members(
            body = body.replaceFirst(DESTROY, ""),
            optionsDoc = optionsDoc,
        )
    }

    return body
        .substringAfter("\n    ")
        .removeSuffix(";\n}")
        .splitToSequence(";\n    /", ";\n    function ")
        .map { if (it.startsWith("**")) "/$it" else it }
        .flatMap { parseTopDefinition(it) }
        .flatMap { it.toMembers(optionsDoc) }
        .toList()
}

private fun Definition.toMembers(optionsDoc: String): Sequence<Member> =
    when {
        body.startsWith("namespace ") -> {
            val newBody = body
                .removePrefix("namespace ")
                .replace("\n    ", "\n")
                .removeSuffix("\n}")
            sequenceOf(NestedNamespace(copy(body = newBody)))
        }

        body.startsWith("type ")
            -> sequenceOf(SimpleType(copy(body = body.removePrefix("type "))))

        body.startsWith("constructor(") -> {
            var constructorBody = body.removeSurrounding("constructor(", ")")
            val optionTypes = OPTIONS_REGEX.findAll(constructorBody)
                .map { it.groupValues[2] }
                .flatMap { source ->
                    val types = source.toOptionTypes("Constructor", false, optionsDoc)
                    constructorBody = constructorBody.replaceFirst(source, types.first().name)
                    types.asSequence()
                }
                .toList()

            val constructor = Constructor(copy(body = constructorBody))
            sequenceOf(constructor) + optionTypes
        }

        body.startsWith("const ")
            -> sequenceOf(Constant(copy(body = body.removePrefix("const "))))

        body.isPropertyLike()
            -> sequenceOf(Property(this))

        else -> toMethodMembers()
    }

internal fun Definition.toMethodMembers(): Sequence<Member> {
    var methodBody = body

    val prefix = methodBody
        .substringBefore("(")
        .substringAfterLast(" ")
        .replaceFirstChar(Char::uppercase)
    val static = methodBody.startsWith("static ")

    val parameters = methodBody
        .substringAfter("(")
        .substringBeforeLast(")")

    val optionTypes = OPTIONS_REGEX.findAll(parameters)
        .map { it.groupValues[2] }
        .flatMap { source ->
            val types = source.toOptionTypes(prefix, static, optionsKdocBody())
            methodBody = methodBody.replaceFirst(source, types.first().name)
            types.asSequence()
        }
        .toList()

    return sequenceOf(Method(copy(body = methodBody))) + optionTypes
}

private fun String.isPropertyLike(): Boolean {
    val pi = indexOf(":")
    val mi = indexOf("(")
    return mi == -1 || pi < mi
}

private fun String.toOptionTypes(
    prefix: String,
    static: Boolean,
    docBody: String,
): List<SimpleType> {
    val name = "${prefix}Options"

    var body = this
    val innerTypes = INNER_OPTIONS_REGEX.findAll(this)
        .map {
            val parameter = it.groupValues[1]
            val typeName = name + parameter.removeSuffix("?")
                .replaceFirstChar(Char::uppercase)
            val typeBody = it.value
                .removePrefix("$parameter: ")
                .let { "$typeName = $it" }

            body = body.replaceFirst(it.value, "$parameter: $typeName")

            SimpleType(Definition("", typeBody), static)
        }.toList()

    val type = SimpleType(Definition("", "$name = $body").also { it.docBody = docBody }, static)
    return listOf(type) + innerTypes
}
