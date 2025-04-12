package karakum.csstype

import karakum.common.ConversionResult

internal const val NONE_TYPE = "NoneType"

internal fun NoneType(
    parentProvider: ParentProvider,
): ConversionResult {
    val parentTypes = sequenceOf("$LENGTH_TYPE.$NONE")
        .plus(parentProvider.parentTypes.sorted())
        .joinToString(",\n")

    val body = """
        sealed external interface $NONE_TYPE:
        $parentTypes
    """.trimIndent()

    return ConversionResult(NONE_TYPE, body)
}
