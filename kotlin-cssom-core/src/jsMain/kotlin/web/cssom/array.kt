package web.cssom

import js.reflect.unsafeCast

fun <T : Any> array(
    vararg values: T,
): T =
    unsafeCast(values.joinToString(" "))
