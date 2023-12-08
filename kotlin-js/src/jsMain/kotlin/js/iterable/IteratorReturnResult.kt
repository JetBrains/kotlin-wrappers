package js.iterable

import js.core.Void
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "done",
    value = "true",
)
sealed external class IteratorReturnResult<out TReturn> :
    IteratorResult<Void, TReturn> {
    val value: TReturn
}
