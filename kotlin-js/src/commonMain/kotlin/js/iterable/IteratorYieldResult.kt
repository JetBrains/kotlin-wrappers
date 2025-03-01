@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.iterable

import js.core.Void
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "done",
    value = "false",
)
external class IteratorYieldResult<out TYield>
private constructor() :
    IteratorResult<TYield, Void> {
    val value: TYield
}
