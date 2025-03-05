package js.iterable

import js.core.JsAny

external interface JsIteratorLike<out T : JsAny?> {
    fun next(): IteratorResult<T, *>
}
