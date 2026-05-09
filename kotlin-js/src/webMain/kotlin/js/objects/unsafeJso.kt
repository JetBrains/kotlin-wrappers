package js.objects

inline fun <T : JsAny> unsafeJso(
    block: @JsoDsl T.() -> Unit,
): T =
    unsafeJso<T>().apply(block)
