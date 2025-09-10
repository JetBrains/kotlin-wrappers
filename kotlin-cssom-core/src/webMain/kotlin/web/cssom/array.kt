package web.cssom

import js.reflect.unsafeCast
import kotlin.js.JsAny

fun <T : JsAny> array(
    vararg values: T,
): T =
    unsafeCast(values.joinToString(" "))
