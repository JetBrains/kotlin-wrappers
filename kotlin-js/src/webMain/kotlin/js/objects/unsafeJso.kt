package js.objects

inline fun <T : JsAny> unsafeJso(
    block: @JsoDsl T.() -> Unit,
): T {
    // TODO: use `apply` after KT-90953 is fixed
    val o = unsafeJso<T>()
    o.block()
    return o
}
