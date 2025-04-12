package karakum.csstype

import karakum.common.ConversionResult

internal const val INTEGER = "Integer"
internal const val INTEGER_TYPE = "IntegerType"

internal fun IntegerType(
    parentProvider: ParentProvider,
): ConversionResult {
    val parentTypes = parentProvider.parentTypes
        .joinToString(",\n")

    val body = """
        sealed external interface $INTEGER_TYPE:
        $parentTypes
        
        ${factory("integer", INTEGER_TYPE, arrayOf("value" to "Int"))}
    """.trimIndent()

    return ConversionResult(INTEGER, body)
}
