package web.cssom

import js.reflect.unsafeCast

fun <T : JsAny> many(
    vararg values: T,
): T =
    unsafeCast(values.joinToString(","))
