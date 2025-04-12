package karakum.csstype

import karakum.common.ConversionResult

internal const val AUTO_TYPE = "AutoType"

internal fun AutoType(
    parentProvider: ParentProvider,
): ConversionResult {
    val parentTypes = sequenceOf("$LENGTH_TYPE.$AUTO")
        .plus((parentProvider.parentTypes + OUTLINE_STYLE).sorted())
        .joinToString(",\n")

    val body = """
        sealed external interface $AUTO_TYPE:
        $parentTypes
    """.trimIndent()

    return ConversionResult(AUTO_TYPE, body)
}
