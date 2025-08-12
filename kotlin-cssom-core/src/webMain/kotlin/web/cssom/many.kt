package web.cssom

import js.core.JsAny
import js.reflect.unsafeCast

fun <T : JsAny> many(
    vararg values: T,
): T =
    unsafeCast(values.joinToString(","))
