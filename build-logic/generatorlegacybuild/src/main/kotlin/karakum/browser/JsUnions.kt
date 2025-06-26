package karakum.browser

import karakum.common.CommonUnionConverter.unionBody

// Remaining interfaces annotated with @JsValue

private val UNION_TYPES = listOf(
    UnionData(
        name = "LastChunkHandling",
        values = listOf(
            "loose",
            "strict",
            "stop-before-partial",
        ),
        pkg = "js.typedarrays",
    ),
    UnionData(
        name = "Alphabet",
        values = listOf(
            "base64",
            "base64url",
        ),
        pkg = "js.typedarrays",
    ),
    UnionData(
        name = "Overflow",
        values = listOf(
            "constrain",
            "reject"
        ),
        pkg = "js.temporal",
    ),
    UnionData(
        name = "RoundingMode",
        values = listOf(
            "ceil",
            "floor",
            "expand",
            "trunc",
            "halfCeil",
            "halfFloor",
            "halfExpand",
            "halfTrunc",
            "halfEven"
        ),
        pkg = "js.temporal",
    ),
    UnionData(
        name = "Disambiguation",
        values = listOf(
            "compatible",
            "earlier",
            "later",
            "reject"
        ),
        pkg = "js.temporal",
    ),
    UnionData(
        name = "PrimitiveHint",
        values = listOf(
            "number",
            "string",
            "default"
        ),
        pkg = "js.symbol",
    ),
)

internal fun jsUnions(): List<ConversionResult> =
    UNION_TYPES.map {
        ConversionResult(
            name = it.name,
            body = unionBody(it.name, it.values),
            pkg = it.pkg,
        )
    }
