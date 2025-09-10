package js.iterable

import js.core.Void
import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface IteratorYieldResult<out TYield : JsAny?> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
