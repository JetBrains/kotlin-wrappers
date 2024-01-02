package js.function

import js.core.JsTuple

sealed external interface JsFunction<in T, in A : JsTuple, out R> {
    fun apply(thisArg: T, args: A): R
}
