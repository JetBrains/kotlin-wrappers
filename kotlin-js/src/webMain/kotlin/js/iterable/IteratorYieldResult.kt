package js.iterable

import js.core.JsAny
import js.core.Void
import js.objects.JsPlainObject

@JsPlainObject
external interface IteratorYieldResult<out TYield : JsAny?> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
