package web.cssom

import js.reflect.unsafeCast

inline fun <T : JsAny> important(
    value: T,
): T =
    unsafeCast("$value !important")
