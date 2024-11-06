package web.cssom

import js.reflect.unsafeCast

fun <T : Any> many(
    vararg values: T,
): T =
    unsafeCast(values.joinToString(","))
