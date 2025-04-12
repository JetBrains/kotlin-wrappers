package karakum.csstype

import karakum.common.ConversionResult

internal const val NUMBER = "Number"
internal const val NUMBER_TYPE = "NumberType"

private val PARENT_TYPES = listOf(
    FLEX,
    "LineHeight",
)

internal fun NumberType(
    parentProvider: ParentProvider,
): ConversionResult {
    val parentTypes = parentProvider.parentTypes
        .plus(PARENT_TYPES)
        .sorted()
        .joinToString(",\n")

    val body = """
        sealed external interface $NUMBER_TYPE:
        $parentTypes
        
        ${factory("number", NUMBER_TYPE, arrayOf("value" to "Double"))}
    """.trimIndent()

    return ConversionResult(NUMBER, body)
}
