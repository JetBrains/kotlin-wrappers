package karakum.csstype

import karakum.common.ConversionResult

internal const val LINE_STYLE_PROPERTY = "LineStyleProperty"

internal fun LineStyleProperty(): ConversionResult {
    val body = """
        sealed external interface $LINE_STYLE_PROPERTY: 
            $BORDER,
            $OUTLINE,
            $OUTLINE_STYLE
    """.trimIndent()

    return ConversionResult(LINE_STYLE_PROPERTY, body)
}
