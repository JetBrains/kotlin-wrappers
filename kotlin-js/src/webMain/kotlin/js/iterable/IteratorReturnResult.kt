package js.iterable

import js.core.Void
import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface IteratorReturnResult<out TReturn : JsAny?> :
    IteratorResult<Void, TReturn> {
    val value: TReturn
}
