package karakum.csstype

import karakum.common.ConversionResult

internal const val NORMAL_TYPE = "NormalType"

internal fun NormalType(
    parentProvider: ParentProvider,
): ConversionResult {
    val parentTypes = sequenceOf("$LENGTH_TYPE.$NORMAL")
        .plus(parentProvider.parentTypes.sorted())
        .joinToString(",\n")

    val body = """
        sealed external interface $NORMAL_TYPE:
        $parentTypes
    """.trimIndent()

    return ConversionResult(NORMAL_TYPE, body)
}
