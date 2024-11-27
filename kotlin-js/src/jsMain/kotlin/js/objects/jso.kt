package js.objects

inline fun <T : Any> jso(): T =
    js("({})")

inline fun <T : Any> jso(
    block: @JsoDsl T.() -> Unit,
): T =
    jso<T>().apply(block)
