package karakum.csstype

import karakum.common.ConversionResult

internal const val IDENT = "Ident"
internal const val IDENT_TYPE = "IdentType"

private val PARENT_TYPES = listOf(
    ANIMATION_NAME,
    CONTAINER_NAME,
    "ScrollTimelineName",
    "ViewTransitionName",

    "GridArea",
    TRANSITION_PROPERTY,
    "WillChange"
)

internal fun IdentType(): ConversionResult {
    val parentTypes = PARENT_TYPES
        .sorted()
        .joinToString(",\n")

    val body = """
        sealed external interface $IDENT:
        $IDENT_TYPE
        
        sealed external interface $IDENT_TYPE:
        $parentTypes
        
        ${factory("ident", IDENT, arrayOf("value" to STRING))}
    """.trimIndent()

    return ConversionResult(IDENT, body)
}
