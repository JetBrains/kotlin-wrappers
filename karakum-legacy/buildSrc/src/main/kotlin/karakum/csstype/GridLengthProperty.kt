package karakum.csstype

import karakum.common.ConversionResult

internal const val GRID_LENGTH_PROPERTY = "GridLengthProperty"

internal val GRID_LENGTH_PROPERTY_PARENTS = listOf(
    "GridAutoTracks",
    "GridTemplateTracks",
)

internal fun GridLengthProperty(): ConversionResult {
    val body = """
        sealed external interface $GRID_LENGTH_PROPERTY:
        ${GRID_LENGTH_PROPERTY_PARENTS.joinToString(",\n")}
    """.trimIndent()

    return ConversionResult(GRID_LENGTH_PROPERTY, body)
}
