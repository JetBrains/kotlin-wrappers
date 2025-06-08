package karakum.cesium

import karakum.common.ConversionResult

private val ERROR_TYPES = setOf(
    "RuntimeError",
    "DeveloperError",
)

internal abstract class TypeBase(
    final override val source: Definition,
) : Declaration(), IType, HasMembers {
    final override val name: String =
        source.defaultName

    var parents: List<String> =
        when (name) {
            in ERROR_TYPES,
                -> listOf("JsError")

            else -> emptyList()
        }

    abstract val typeName: String
    abstract val companion: HasMembers?
    open val staticBody: Boolean = false

    private val abstract: Boolean by lazy {
        source.abstract || name == "TilingScheme"
    }

    private val hasPrivateConstructor: Boolean by lazy {
        source.hasPrivateConstructor
    }

    override val members by lazy {
        val filter: (Member) -> Boolean = if (hasPrivateConstructor) {
            { it !is Constructor }
        } else {
            { true }
        }

        members(source.body, source.optionsKdocBody())
            .filter(filter)
            .onEach { it.parent = this }
            .onEach { if (!it.static) it.abstract = abstract }
    }

    private fun Constructor?.propertyParameters(): List<Property> {
        this ?: return emptyList()

        if (parameters.isEmpty())
            return emptyList()

        val parameterMap = parameters
            .associate { it.name to it.type }

        return members.asSequence()
            .filterIsInstance<Property>()
            .filter { parameterMap[it.name] == it.type }
            .toList()
    }

    override fun toCode(): String =
        toCode(true)

    fun toCode(top: Boolean): String {
        val constructor = members.firstOrNull() as? Constructor
        var constructorBody = when {
            hasPrivateConstructor -> "\nprivate constructor()"
            constructor != null -> constructor.toCode().removePrefix("constructor")
            else -> ""
        }

        val propertyParameters = constructor.propertyParameters()
        for (p in propertyParameters) {
            val parameter = "${p.name}: ${p.type}"
            val param = if ("$parameter?" in constructorBody) "$parameter?" else parameter
            constructorBody = constructorBody.replaceFirst(param, p.declaration)
        }

        if (name in ERROR_TYPES) {
            constructorBody = constructorBody.replaceFirst(
                "val message:",
                "override val message:",
            )
        }

        val companionMembers = companion?.members
            ?.filterNot { it.isNestedType() }
            ?: emptyList()

        val nestedTypes = companion?.members
            ?.filter { it.isNestedType() }
            ?: emptyList()

        val bodyMembers = members
            .asSequence()
            .filter { it != constructor }
            .filter { staticBody || !it.static }
            .plus(nestedTypes)
            // WA for duplicated option types
            .distinct()
            .filter(constructor.toMemberFilter())
            .toList()

        val typeAliases = bodyMembers
            .filterIsInstance<SimpleType>()
            .filter { it.isTypeAlias }

        var body = bodyMembers
            .asSequence()
            .minus(typeAliases)
            .minus(propertyParameters)
            .map { it.toCode() }
            .filter { it.isNotEmpty() } // TEMP
            .joinToString(separator = "\n\n")

        if (!staticBody) {
            val staticMembers = members.filter { it.static }
                .plus(companionMembers)

            val packable = name != PACKABLE
                    && name != "PlaneOutlineGeometry" // WA
                    && staticMembers.any { it.name == PACKED_LENGTH }

            if (packable) {
                staticMembers.asSequence()
                    .filter { it.name in PACKABLE_MEMBERS }
                    .forEach { it.overridden = true }
            }

            val companionBody = staticMembers
                .map { it.toCode() }
                .joinToString(separator = "\n\n")

            val companionTypes = if (packable) {
                ": $PACKABLE<$name>"
            } else ""

            if (companionBody.isNotEmpty()) {
                body += "\n\ncompanion object $companionTypes {\n$companionBody\n}"
            }
        }

        val parentNames = if (parents.isNotEmpty()) {
            " : " + (if (constructorBody.endsWith("()")) "\n" else "") + parents.joinToString(", ")
        } else ""

        // TODO: move cleanup to separate method
        body = "$constructorBody $parentNames {\n$body\n}\n"
            .replace(": $name.", ": ")

        val header = if (top) {
            DEFAULT_PACKAGE
        } else ""

        val modifiers = (if (top) "external " else "") +
                (if (abstract) "abstract " else "")

        val hideParams = constructor != null && !constructor.hasParameters

        val doc = propertyParameters
            .fold(source.doc(DocLink(this), hideParams)) { acc, p ->
                acc.replaceFirst("@param [${p.name}]", "@property [${p.name}]")
            }

        val declaration = when (name) {
            "Event" -> "$name<Listener : Function<Unit>>"
            else -> name
        }

        return header +
                doc +
                "\n" +
                "$modifiers $typeName $declaration $body"
    }

    override fun toConversionResults(): Sequence<ConversionResult> {
        val nestedTypes = companion?.members
            ?.filter { it.isNestedType() }
            ?: emptyList()

        val typeAliases = members
            .asSequence()
            .plus(nestedTypes)
            .filterIsInstance<SimpleType>()
            .filter { it.isTypeAlias }
            .filter {
                when (it.name) {
                    "RemoveCallback" -> name == "Event"
                    "DoneCallback" -> name == "KmlTourFlyTo"
                    "AnimationTimeCallback" -> name == "ModelAnimation"
                    else -> true
                }
            }
            .map { ConversionResult(name = it.longName, body = DEFAULT_PACKAGE + it.toCode()) }

        return super.toConversionResults()
            .plus(typeAliases)
    }
}

private fun Member.isNestedType(): Boolean {
    if (this is NestedNamespace)
        return true

    if (this !is SimpleType)
        return false

    return name.startsWith(CONSTRUCTOR_OPTIONS)
            || !name.endsWith("Options")
}

private fun Constructor?.toMemberFilter(): (Member) -> Boolean {
    if (this == null || !hiddenOptions)
        return { true }

    return {
        it !is SimpleType || !it.name.startsWith(CONSTRUCTOR_OPTIONS)
    }
}
