package js.objects

import js.core.JsAny

inline fun <T : JsAny> unsafeJso(
    block: @JsoDsl T.() -> Unit,
): T =
    unsafeJso<T>().apply(block)
