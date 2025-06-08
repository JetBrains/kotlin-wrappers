package karakum.csstype

import karakum.common.ConversionResult

internal const val LENGTH_PROPERTY = "LengthProperty"

internal fun LengthProperty(
    parentProvider: ParentProvider,
): ConversionResult {
    val parentTypes = parentProvider.parentTypes
        .plus(AUTO_LENGTH_PROPERTY)
        .minus(GRID_LENGTH_PROPERTY_PARENTS)
        .sorted()
        .joinToString(",\n")

    val body = """
        sealed external interface $LENGTH_PROPERTY:
        $parentTypes
    """.trimIndent()

    return ConversionResult(LENGTH_PROPERTY, body)
}
