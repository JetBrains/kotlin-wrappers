@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.iterable

import js.core.Void
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "done",
    value = "true",
)
external class IteratorReturnResult<out TReturn>
private constructor() :
    IteratorResult<Void, TReturn> {
    val value: TReturn
}
