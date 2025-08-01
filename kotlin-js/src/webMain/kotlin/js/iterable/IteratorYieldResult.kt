package js.iterable

import js.core.JsAny
import js.core.Void
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "done",
    value = "false",
)
external class IteratorYieldResult<out TYield : JsAny?>
private constructor() :
    IteratorResult<TYield, Void> {
    val value: TYield
}
