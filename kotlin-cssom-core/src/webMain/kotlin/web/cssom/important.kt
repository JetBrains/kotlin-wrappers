package web.cssom

import js.reflect.unsafeCast
import kotlin.js.JsAny

inline fun <T : JsAny> important(
    value: T,
): T =
    unsafeCast("$value !important")
