package web.cssom

import js.reflect.unsafeCast

inline fun <T : Any> important(
    value: T,
): T =
    unsafeCast("$value !important")
