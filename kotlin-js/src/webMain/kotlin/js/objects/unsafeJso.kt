package js.objects

import kotlin.js.JsAny

inline fun <T : JsAny> unsafeJso(
    block: @JsoDsl T.() -> Unit,
): T =
    unsafeJso<T>().apply(block)
