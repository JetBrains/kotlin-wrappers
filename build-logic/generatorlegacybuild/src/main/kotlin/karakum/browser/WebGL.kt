package karakum.browser

import karakum.common.CommonUnionConverter.objectUnionBody
import karakum.common.unionConstant

internal fun webglDeclarations(
    content: String,
): Sequence<ConversionResult> =
    sequenceOf(
        convertExtension(content),
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
