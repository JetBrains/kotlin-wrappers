package js.iterable

import js.core.JsAny
import js.core.Void
import js.objects.JsPlainObject

@JsPlainObject
external interface IteratorReturnResult<out TReturn : JsAny?> :
    IteratorResult<Void, TReturn> {
    val value: TReturn
}
