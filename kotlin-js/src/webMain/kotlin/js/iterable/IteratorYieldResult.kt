package js.iterable

import js.core.Void
import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface IteratorYieldResult<out TYield : JsAny?> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
