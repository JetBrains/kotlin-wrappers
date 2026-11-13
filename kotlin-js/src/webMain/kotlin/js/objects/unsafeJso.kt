package js.objects

// TODO: use `apply` after KT-90953 is fixed
inline fun <T : JsAny> unsafeJso(
    block: @JsoDsl T.() -> Unit,
): T {
    val result = unsafeJso<T>()
    result.block()
    return result
}
