package js.iterable

import js.promise.Promise
import kotlin.js.JsAny

external interface AsyncIteratorLike<out T : JsAny?> {

    fun next(): Promise<IteratorResult<T, *>>
}
