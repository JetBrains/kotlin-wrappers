package js.iterable

import js.core.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface IteratorReturnResult<out TReturn : JsAny?> :
    IteratorResult<Void, TReturn> {
    val value: TReturn
}
