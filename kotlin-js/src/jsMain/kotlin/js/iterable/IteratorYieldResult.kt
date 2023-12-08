package js.iterable

import js.core.Void
import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "done",
    value = "false",
)
sealed external class IteratorYieldResult<out TYield> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
