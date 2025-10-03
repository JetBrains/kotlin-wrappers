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

internal val FINAL_MAP_LIKE = setOf(
    "FormData",
    "Headers",
    "URLSearchParams",
)

internal val MAP_LIKE = setOf(
    "MediaKeyStatusMap",
    "StylePropertyMapReadOnly",
) + FINAL_MAP_LIKE

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

internal fun listLikeOverrides(
    itemType: String,
): String = """
override fun entries(): JsIterator<Tuple2<Int, $itemType>>
override fun keys(): JsIterator<Int>
override fun values(): JsIterator<$itemType>
override fun forEach(action: (item: $itemType) -> Unit)
""".trimIndent()

internal fun mapLikeOverrides(
    keyType: String,
    valueType: String,
): String = """
override fun entries(): JsIterator<Tuple2<$keyType, $valueType>>
override fun keys(): JsIterator<$keyType>
override fun values(): JsIterator<$valueType>
override fun forEach(action: (value: $valueType, key: $keyType) -> Unit)
""".trimIndent()
