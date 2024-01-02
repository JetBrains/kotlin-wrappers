@file:Suppress("NOTHING_TO_INLINE")

package js.function

import js.core.JsTuple

inline fun <R> JsFunction(noinline fn: () -> R): JsFunction<Nothing?, JsTuple, R> =
    fn.unsafeCast<JsFunction<Nothing?, JsTuple, R>>()
