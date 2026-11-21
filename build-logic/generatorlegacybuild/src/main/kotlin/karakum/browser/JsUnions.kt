package karakum.browser

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
        contentPath = "Uint8Array/fromBase64#lastchunkhandling",
    ),
    UnionData(
        name = "Alphabet",
        values = listOf(
            "base64",
            "base64url",
        ),
        pkg = "js.typedarrays",
        contentPath = "Uint8Array/fromBase64#alphabet",
    ),
    UnionData(
        name = "Overflow",
        values = listOf(
            "constrain",
            "reject",
        ),
        pkg = "js.temporal",
        contentPath = "Temporal/Instant/since",
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
            "halfEven",
        ),
        pkg = "js.temporal",
        contentPath = "Intl/NumberFormat/NumberFormat#roundingmode",
    ),
    UnionData(
        name = "Disambiguation",
        values = listOf(
            "compatible",
            "earlier",
            "later",
            "reject",
        ),
        pkg = "js.temporal",
        contentPath = "Temporal/PlainDateTime/toZonedDateTime#disambiguation",
    ),
    UnionData(
        name = "PrimitiveHint",
        values = listOf(
            "number",
            "string",
            "default",
        ),
        pkg = "js.primitive",
        contentPath = "Symbol/toPrimitive#description",
    ),
)

internal fun jsUnions(): List<ConversionResult> =
    UNION_TYPES.map { it.toConversionResult() }
