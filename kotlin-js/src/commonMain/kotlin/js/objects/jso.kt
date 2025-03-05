package js.objects

import js.core.JsAny

inline fun <T : JsAny> jso(
    block: @JsoDsl T.() -> Unit,
): T =
    jso<T>().apply(block)
