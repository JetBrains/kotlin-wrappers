package karakum.browser

internal val FINAL_LIST_LIKE = setOf(
    "CSSNumericArray",
    "CSSTransformValue",
    "CSSUnparsedValue",

    "DOMTokenList",
)

internal val LIST_LIKE = setOf(
    "NodeList",
) + FINAL_LIST_LIKE

internal class MapLikeParameters(
    val key: String,
    val value: String,
)

internal fun mapLikeParameters(
    source: String,
): MapLikeParameters? {
    if (!source.startsWith("["))
        return null

    val (key, value) = source
        .removeSurrounding("[", "]")
        .replace("string", "String")
        .replace(", Iterable<", ", JsIterable<")
        .replace(", CSSStyleValue[]", ", ReadonlyArray<CSSStyleValue>")
        .split(", ")

    return MapLikeParameters(
        key = key,
        value = value,
    )
}
