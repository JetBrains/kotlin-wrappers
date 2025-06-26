package karakum.react

import karakum.common.JsUnionConverter.sealedUnionBody
import karakum.common.removeQuoteSurrounding
import karakum.common.startsWithAnyQuote

internal fun convertUnion(
    name: String,
    source: String,
): ConversionResult? {
    if ("<" in name)
        return null

    val sourceType = source
        .removePrefix(" | ")
        .trim()

    if (!sourceType.startsWithAnyQuote()) {
        return null
    }

    val values = sourceType
        .splitToSequence(" | ")
        .filter { it != "(string & {})" }
        .map { it.removeQuoteSurrounding() }
        .toList()

    return convertUnion(name, values)
}

internal fun convertUnion(
    name: String,
    values: List<String>,
): ConversionResult =
    ConversionResult(
        name = name,
        body = sealedUnionBody(name, values),
    )
