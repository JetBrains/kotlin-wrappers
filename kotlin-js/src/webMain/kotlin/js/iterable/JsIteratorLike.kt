package js.iterable

import kotlin.js.JsAny

external interface JsIteratorLike<out T : JsAny?> {

    fun next(): IteratorResult<T, *>
}
