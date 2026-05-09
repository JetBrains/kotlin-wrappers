package js.iterable

import js.promise.Promise

external interface AsyncIteratorLike<out T : JsAny?> {

    fun next(): Promise<IteratorResult<T, *>>
}
