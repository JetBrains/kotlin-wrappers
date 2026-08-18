package karakum.browser

private val EXTENSION_PREFIXES = listOf(
    "ANGLE_",
    "EXT_",
    "KHR_",
    "OES_",
    "OVR_",
    "WEBGL_",
)

internal fun isWebglExtensionName(
    name: String,
): Boolean =
    EXTENSION_PREFIXES.any { name.startsWith(it) }

internal fun webglDeclarations(
    content: String,
): Sequence<ConversionResult> =
    sequenceOf(
        convertConstants(content),
    )

private fun convertConstants(
    content: String,
): ConversionResult {
    val constants = constants(content, "WebGL2RenderingContext")

    constants(content, "WebGLRenderingContext")
        .forEach { require(it in constants) }

    val body = constants.joinToString("\n\n") { it.toCode() }

    return ConversionResult(
        name = "WebGLConstants",
        body = body,
        pkg = "web.gl",
    )
}

private object ConstantDataMap {
    private val data = webglConstantsData()
    private val constantMap: Map<String, GLConstant> =
        data.flatMap { it.constants }
            .associateBy { it.name }

    private val groupMap: Map<String, GLConstantGroup> =
        buildMap {
            for (group in data) {
                for (constant in group.constants) {
                    put(constant.name, group)
                }
            }
        }

    fun getDescription(
        name: String,
    ): String =
        constantMap.getValue(name).description

    fun getGroupType(
        name: String,
    ): String? =
        groupMap.getValue(name).type
}

private fun constants(
    content: String,
    typeName: String,
): List<WebGLConstant> {
    val typeProvider = TypeProvider(typeName)

    return content
        .substringAfter("declare var $typeName: {")
        .substringBefore("\n};")
        .trimIndent()
        .splitToSequence("\n")
        .filter { it.startsWith("readonly ") }
        .map { it.removeSurrounding("readonly ", ";") }
        .map {
            val (name, value) = it.split(": ")
            WebGLConstant(
                name = name,
                type = typeProvider.numberType(name),
                value = value,
            )
        }
        .toList()
}

private data class WebGLConstant(
    private val name: String,
    private val type: String,
    private val value: String,
) {
    fun toCode(): String {
        val valuePrefix = "u"
            .takeIf { !value.startsWith("-") }
            ?.takeIf { value.removePrefix("0x").toUInt(16) > Int.MAX_VALUE.toUInt() }
            ?: ""

        val description = ConstantDataMap.getDescription(name)
        val typeComment = ConstantDataMap.getGroupType(name)
            ?.let { "/* $it */" } ?: ""
        val kdoc = (if (description.isNotEmpty()) listOf(description, "") else emptyList())
            .plus("[MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL_API/Constants#:~:text=$name)")
            .joinToString("\n", "/**\n", "\n*/") { "* $it" }

        return """
        $kdoc
        inline val $name: $type $typeComment
            get() = $type($value$valuePrefix)
        """.trimIndent()
    }
}
