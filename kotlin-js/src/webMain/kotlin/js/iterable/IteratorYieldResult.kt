package js.iterable

import js.core.Void
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#next)
 */
@JsPlainObject
external interface IteratorYieldResult<out TYield : JsAny?> :
    IteratorResult<TYield, Void> {
    val value: TYield
}
