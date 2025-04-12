package karakum.virtual

import karakum.common.ConversionResult
import karakum.common.sealedUnionBody

internal fun convertUnion(
    name: String,
    source: String,
): ConversionResult {
    val values = source
        .splitToSequence(" | ")
        .map { it.removeSurrounding("'") }
        .toList()

    return convertUnion(name, values)
}

private fun convertUnion(
    name: String,
    values: List<String>,
): ConversionResult =
    ConversionResult(
        name = name,
        body = sealedUnionBody(name, values),
    )
