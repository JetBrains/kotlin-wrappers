package js.iterable

import js.core.JsAny
import js.core.JsAnyMarker
import js.promise.Promise

external interface AsyncIteratorLike<out T : JsAny?> :
    JsAnyMarker {

    fun next(): Promise<IteratorResult<T, *>>
}
