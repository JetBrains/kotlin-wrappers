package web.cssom

import js.reflect.unsafeCast

fun <T : JsAny> array(
    vararg values: T,
): T =
    unsafeCast(values.joinToString(" "))
