@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * Options for arithmetic operations like `add()` and `subtract()`
 */
@JsPlainObject
external interface ArithmeticOptions :
    JsAny {

    /**
     * Controls handling of out-of-range arithmetic results.
     *
     * If a result is out of range, then `'constrain'` will clamp the result to
     * the allowed range, while `'reject'` will throw a RangeError.
     *
     * The default is `'constrain'`.
     */
    val overflow: Overflow?
}
