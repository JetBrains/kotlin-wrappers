package js.iterable

import js.core.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface IteratorYieldResult<out TYield : JsAny?> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
