package karakum.csstype

import karakum.common.ConversionResult

internal const val GRID_LINE_PROPERTY = "GridLineProperty"

internal fun GridLineProperty(): ConversionResult {
    val body = """
        sealed external interface $GRID_LINE_PROPERTY
    """.trimIndent()

    return ConversionResult(GRID_LINE_PROPERTY, body)
}
