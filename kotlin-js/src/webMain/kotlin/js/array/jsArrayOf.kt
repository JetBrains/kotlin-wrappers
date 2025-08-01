package js.array

import js.core.JsAny

expect fun <T : JsAny?> jsArrayOf(
    vararg elements: T,
): ReadonlyArray<T>
