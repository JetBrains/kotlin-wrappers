package karakum.browser

import karakum.common.CommonUnionConverter.objectUnionBody
import karakum.common.unionConstant

internal fun webglDeclarations(
    content: String,
): Sequence<ConversionResult> =
    sequenceOf(
        convertExtension(content),
        convertConstants(content),
    )

private fun convertExtension(
    source: String,
): ConversionResult {
    val values = source.splitToSequence("\n")
        .filter { "WebGLExtension." in it }
        .map { it.substringAfter("WebGLExtension.") }
        .map { it.substringBefore(")") }
        .toList()

    return ConversionResult(
        name = "WebGLExtension",
        body = objectUnionBody(
            name = "WebGLExtension",
            constants = values.map(::unionConstant),
        ),
        pkg = "web.gl",
    )
}

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

        return """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL_API/Constants#:~:text=$name)
         */
        inline val $name: $type
            get() = $type($value$valuePrefix)
        """.trimIndent()
    }
}
