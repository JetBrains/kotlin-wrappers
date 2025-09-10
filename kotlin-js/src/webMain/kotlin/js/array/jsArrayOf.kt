package js.array

import kotlin.js.JsAny

expect fun <T : JsAny?> jsArrayOf(
    vararg elements: T,
): ReadonlyArray<T>
