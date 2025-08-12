package web.cssom

import js.core.JsAny
import js.reflect.unsafeCast

inline fun <T : JsAny> important(
    value: T,
): T =
    unsafeCast("$value !important")
