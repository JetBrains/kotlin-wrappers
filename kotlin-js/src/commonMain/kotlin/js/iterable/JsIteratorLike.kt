package js.iterable

import js.core.JsAny
import js.core.JsAnyMarker

external interface JsIteratorLike<out T : JsAny?> :
    JsAnyMarker {

    fun next(): IteratorResult<T, *>
}
