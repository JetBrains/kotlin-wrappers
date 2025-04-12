package karakum.csstype

import karakum.common.ConversionResult

internal const val BLEND_MODE_PROPERTY = "BlendModeProperty"

internal fun BlendModeProperty(): ConversionResult {
    val body = """
        sealed external interface $BLEND_MODE_PROPERTY
    """.trimIndent()

    return ConversionResult(BLEND_MODE_PROPERTY, body)
}
