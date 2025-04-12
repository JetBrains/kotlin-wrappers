package karakum.csstype

import karakum.common.ConversionResult

internal const val STRING = "String"
internal const val STRING_TYPE = "StringType"

private val PARENT_TYPES = listOf(
    "Content",
    "FontFamily",
)

internal fun StringType(): ConversionResult {
    val parentTypes = PARENT_TYPES
        .sorted()
        .joinToString(",\n")

    val body = """
        sealed external interface $STRING_TYPE:
        $parentTypes
        
        ${factory("string", STRING_TYPE, arrayOf("value" to STRING))}
    """.trimIndent()

    return ConversionResult(STRING, body)
}
