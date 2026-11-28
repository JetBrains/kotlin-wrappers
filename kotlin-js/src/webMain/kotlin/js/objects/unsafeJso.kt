package js.objects

// TODO: make internal after KT-76286 is fixed
inline fun <T : JsAny> unsafeJso(
    block: @JsoDsl T.() -> Unit,
): T {
    // TODO: use `apply` after KT-90953 is fixed
    val o = unsafeJso<T>()
    o.block()
    return o
}
