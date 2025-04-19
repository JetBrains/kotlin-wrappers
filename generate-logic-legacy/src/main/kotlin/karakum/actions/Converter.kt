package karakum.actions

import karakum.common.*

private val EXCLUDED_NAMES = setOf(
    "getDetails",
    "getCacheEntry",
    "reserveCache",
    "retryTypedResponse",

    "internalCacheTwirpClient",
    "internalArtifactTwirpClient",
).flatMap { sequenceOf(it, "${it}Async") }

private val REDUNDANT_CONTEXT = """
export declare const context: Context.Context;
export declare const defaults: OctokitOptions;
""".trimIndent()

private const val STATIC_MARKER = "/* static */\n"

internal fun convert(
    content: String,
): Sequence<ConversionResult> {
    val body = cleanup(content)

    return ("\n" + body).splitToSequence("\nexport declare ", "\nexport ", "\ndeclare ")
        .drop(1)
        .map { it.substringBefore("\n/**") }
        // TODO: check
        .filter { !it.startsWith("const chmod") }
        .mapNotNull { convertItem(it) }
        .filter { it.name !in EXCLUDED_NAMES }
}

private fun cleanup(
    content: String,
): String =
    content.replace(REDUNDANT_CONTEXT, "")
        .splitToSequence("\n")
        .filter { line -> !line.startsWith("/// ") }
        .filter { line -> !line.startsWith("import ") }
        .filter { line -> !line.startsWith("export * ") }
        .filter { line -> !line.startsWith("    private _") }
        .joinToString("\n")
        .replace(": Context.Context", ": Context")
        .replace("type RetryOptions = {", "interface RetryOptions {")
        .replace(" ifm.", " ")
        .replace(" im.", " ")
        .replace("<ifm.", "<")
        .trim()

private fun convertItem(
    source: String,
): ConversionResult? {
    if (source.startsWith("{"))
        return null

    if (source.startsWith("default "))
        return null

    val type = source.substringBefore(" ")
    val itemSource = source.substringAfter(" ")
    return when (type) {
        "interface" -> convertInterface(itemSource)
        "class" -> convertClass(itemSource)
        "function" -> convertFunction(itemSource)
        "enum" -> convertEnum(itemSource)
        "type" -> convertType(itemSource)
        "const" -> convertConst(itemSource)
        else -> TODO("Unable to convert item:\n$source")
    }
}

private fun convertEnum(
    source: String,
): ConversionResult {
    val name = source.substringBefore(" ")

    val memberSource = source.substringAfter(" {\n")
        .substringBefore("\n}")
        .trimIndent()

    val constants = memberSource
        .splitToSequence(",\n")
        .map { constSource ->
            val comment = if ("\n" in constSource) {
                constSource.substringBeforeLast("\n")
            } else null

            val (constName, value) = constSource.substringAfterLast("\n").split(" = ")
            UnionConstant(
                name = constName,
                value = value,
                originalValue = true,
                comment = comment,
            )
        }
        .toList()

    val body = unionBodyByConstants(
        name = name,
        constants = constants,
    )

    return ConversionResult(
        name = name,
        body = body,
    )
}

private fun convertInterface(
    source: String,
): ConversionResult {
    val name = source.substringBefore(" ")
        .substringBefore("<")

    val declaration = source.substringBefore(" {\n")

    val memberSource = source.substringAfter(" {\n")
        .substringBefore(";\n}")
        .replace("/**`", "/ **`")
        .replace("/*`", "/ *`")
        .trimIndent()

    if (memberSource == "[key: string]: any")
        return ConversionResult(
            name = name,
            body = "typealias $name = Record<String, Any>"
        )

    var members = memberSource
        .replace("env?: {\n    [key: string]: string;\n};", "env?: Record<string, string>;")
        .splitToSequence(";\n")
        .mapNotNull { convertMember(it) }
        .joinToString("\n")
        .prependIndent("    ")

    val hasFunctions = " fun " in members || "\nfun " in members
    if (!hasFunctions)
        members = members.replace("    var ", "    val ")

    val annotation = when {
        hasFunctions -> null
        else -> "@JsPlainObject"
    }

    val body = listOfNotNull(
        annotation,
        "external interface $declaration {\n$members\n}",
    ).joinToString("\n")

    return ConversionResult(
        name = name,
        body = body,
    )
}

private fun convertClass(
    source: String,
): ConversionResult {
    val name = source.substringBefore(" ")
        .substringBefore("<")

    val declaration = source.substringBefore(" {\n")
        .replace(" extends events.EventEmitter", " : node.events.EventEmitter")
        .replace(" extends stream.Transform", " : node.stream.Transform")
        .replace(" extends Error", " : JsError")
        .replace(" extends ", " : ")
        .replace(" implements ", " : ")

    val memberSource = source.substringAfter(" {\n")
        .substringBefore(";\n}")
        .replace("/**`", "/ **`")
        .replace("/*`", "/ *`")
        .trimIndent()

    val allMembers = memberSource
        .split(";\n")
        .mapNotNull { convertMember(it) }

    val members = allMembers
        .filter { STATIC_MARKER !in it }
        .joinToString("\n")

    val staticMembers = allMembers
        .filter { STATIC_MARKER in it }
        .map { it.replace(STATIC_MARKER, "") }
        .joinToString("\n")

    val companionBody = if (staticMembers.isNotEmpty()) {
        "companion object {\n$staticMembers\n}"
    } else ""

    val content = sequenceOf(
        members,
        companionBody,
    ).filter { it.isNotEmpty() }
        .joinToString("\n")

    var body = "external class $declaration {\n$content\n}"

    body = when (name) {
        "DefaultGlobber",
            -> body
            .replace("fun getSearchPaths(", "override fun getSearchPaths(")
            .replace("fun glob(", "override fun glob(")
            .replace("fun globGenerator(", "override fun globGenerator(")

        in CREDENTIAL_HANDLERS,
            -> body
            .replace("fun prepareRequest(", "override fun prepareRequest(")

        else -> body
            .replace("fun toString(", "override fun toString(")
    }

    when (name) {
        "DefaultArtifactClient",
            -> body = "sealed " +
                body.replace("\nfun ", "override fun ")
                    .replace(" = definedExternally", "")

        "DefaultGlobber",
            -> body = "sealed $body"
    }

    return ConversionResult(
        name = name,
        body = body,
    )
}


private fun convertFunction(
    source: String,
): ConversionResult {
    val name = source
        .substringBefore("(")
        .substringBefore("<")

    // WA
    if ((name == "extractTar" || name == "extractXar") && ": string | string[]" in source)
        return convertFunction(source.replace(": string | string[]", ": string[]"))

    val bodySource = source
        .substringBefore(";\n")
        .removeSuffix(";")
        .replace(": Map<number, string>", ": Map<number_string>")

    val body = methodSourceVariants(bodySource)
        .map { convertMethod(it) }
        .flatMap { withSuspendAdapter(it) }
        .joinToString("\n\n") {
            ("\n" + it)
                .replace("\nsuspend fun ", "\nsuspend external fun ")
                .replace("\nfun ", "\nexternal fun ")
                .removePrefix("\n")
        }

    return ConversionResult(
        name = name,
        body = body,
    )
}

private fun convertType(
    source: String,
): ConversionResult? {
    val (name, bodySource) = source
        .removeSuffix(";")
        .split(" = ")

    when (name) {
        "IToolRelease",
        "IToolReleaseFile",
            -> return null
    }

    val body = when {
        "' | '" in bodySource -> {
            val values = bodySource
                .split(" | ")
                .map { it.removeSurrounding("'") }

            unionBody(name, values)
        }

        bodySource == "(SummaryTableCell | string)[]"
            -> "typealias $name = ReadonlyArray<Any /* SummaryTableCell | String */>"

        else -> TODO("Unable to convert body source: '$bodySource'")
    }

    return ConversionResult(
        name = name,
        body = body,
    )
}

private fun convertConst(
    source: String,
): ConversionResult {
    val name = source
        .substringBefore(":")
        .substringBefore(" = ")

    val body = if (" = " in source) {
        val value = source
            .substringAfter(" = ")
            .removeSuffix(";")

        "const val $name = $value"
    } else {
        val typeSource = source
            .substringAfter(": ")
            .removeSuffix(";")

        val type = when (name) {
            "GitHub" -> "dynamic /* $typeSource */"
            else -> kotlinType(typeSource)
        }

        "external val $name: $type"
    }

    return ConversionResult(
        name = name,
        body = body,
    )
}

private fun convertMember(
    source: String,
): String? {
    if ("\n" in source) {
        val member = convertMember(source.substringAfterLast("\n"))
            ?: return null

        val comment = source.substringBeforeLast("\n")
            .addInnerInterfaceFix()

        return "$comment\n$member"
    }

    return when {
        source == "}" -> source
        source.trim() == "[key: string]: any" -> "// $source"

        source == "static isNetworkErrorCode: (code?: string) => boolean" ||
                source == "static isUsageErrorMessage: (msg?: string) => boolean"
            -> "companion object {\n" +
                source.replace("static ", "fun ")
                    .replace(": (", "(")
                    .replace("?: string) => boolean", ": String?): Boolean") +
                "\n}"

        source == "private constructor()"
            -> "    // $source"

        source.startsWith("private ")
            -> null

        source.startsWith("constructor(")
            -> convertConstructor(source)

        "(" in source.substringBefore(":")
            -> methodSourceVariants(source)
            .joinToString("\n\n") {
                convertMethod(it)
            }

        else -> convertProperty(source)
    }
}

private fun convertProperty(
    source: String,
): String {
    val cleanSource = source.removePrefix("readonly ")
    val readonly = cleanSource != source
    val nameSource = cleanSource.substringBefore(": ")
    val typeSource = cleanSource.substringAfter(": ")

    val name = nameSource.removeSuffix("?")
    var type = kotlinType(typeSource)

    if (nameSource.endsWith("?")) {
        if (type.startsWith("("))
            type = "($type)"

        if (!type.endsWith("?"))
            type += "?"
    }

    val modifier = if (readonly) "val" else "var"
    return "$modifier $name: $type"
}

private fun convertConstructor(
    source: String,
): String {
    // TODO: move to patches
    sequenceOf(
        "string | string[]",
    ).forEach { unionType ->
        if (": $unionType" in source) {
            val (t1, t2) = unionType.split(" | ")

            return sequenceOf(
                source.replace(": $unionType", ": $t1"),
                source.replace(": $unionType", ": $t2"),
            ).map { convertConstructor(it) }
                .joinToString("\n\n")
        }
    }

    val parameters = convertParameters(
        source.removeSurrounding("constructor(", ")")
    ).joinToString(",\n")

    return "constructor($parameters)"
}

private val UNION_TYPES = listOf(
    "string | NodeJS.ReadableStream",
    "string | Error",
    "string | string[]",
    "number | string",
    "Buffer | string",
)

private fun methodSourceVariants(
    methodSource: String,
): List<String> {
    var result = listOf(methodSource)

    for (unionType in UNION_TYPES) {
        result = result.flatMap { source ->
            if (": $unionType" in source) {
                val (t1, t2) = unionType.split(" | ")

                sequenceOf(
                    source.replace(": $unionType", ": $t1"),
                    source.replace(": $unionType", ": $t2"),
                )
            } else sequenceOf(source)
        }
    }

    return result
}

private fun methodDeclaration(
    source: String,
): String {
    if ("<" !in source)
        return source

    val name = source.substringBefore("<")
    val typeParameters = source.substringAfter(name)

    return "$typeParameters $name"
}

private fun convertMethod(
    source: String,
): String {
    if (source == "readBodyBuffer?(): Promise<Buffer>")
        return "val readBodyBuffer: (() -> Promise<Buffer<*>>)?"

    if (source.startsWith("static "))
        return STATIC_MARKER + convertMethod(source.removePrefix("static "))

    val declaration = methodDeclaration(source.substringBefore("("))

    val parameters = convertParameters(
        source.substringAfter("(")
            .substringBeforeLast("): ")
    ).joinToString(",\n")

    val returns = when (val returnType = kotlinType(source.substringAfter("): "))) {
        "void" -> ""
        else -> ": $returnType"
    }

    return "fun $declaration($parameters)$returns"
}

private fun convertParameters(
    source: String,
): List<Parameter> {
    if (source.isEmpty())
        return emptyList()

    if (source == "body: Record<string, unknown> | null") {
        return listOf(
            Parameter(
                name = "body",
                type = "ReadonlyRecord<String, Any?>?",
                vararg = false,
                optional = false,
            )
        )
    }


    if ("onResult: (err?: Error, res?: HttpClientResponse) => void" in source) {
        return source
            .substringBefore(", onResult: ")
            .split(", ")
            .map { convertParameter(it) }
            .plus(Parameter("onResult", "(err: JsError?, res: HttpClientResponse?) -> Unit", false, false))
    }

    return source
        .split(", ")
        .map { convertParameter(it) }
}

private fun convertParameter(
    source: String,
): Parameter {
    val nameSource = source.substringBefore(": ")
    var typeSource = source.substringAfter(": ")

    var name = nameSource
        .removePrefix("...")
        .removeSuffix("?")

    if (name == "val")
        name = "value"

    val vararg = nameSource.startsWith("...")
    if (vararg) {
        typeSource = typeSource.removeSuffix("[]")
    }

    return Parameter(
        name = name,
        type = kotlinType(typeSource),
        vararg = vararg,
        optional = nameSource.endsWith("?"),
    )
}
