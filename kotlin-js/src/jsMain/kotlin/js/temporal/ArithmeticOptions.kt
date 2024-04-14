package js.temporal

import js.objects.JsPlainObject

/**
 * Options for arithmetic operations like `add()` and `subtract()`
 */
@JsPlainObject
sealed external interface ArithmeticOptions {
    /**
     * Controls handling of out-of-range arithmetic results.
     *
     * If a result is out of range, then `'constrain'` will clamp the result to
     * the allowed range, while `'reject'` will throw a RangeError.
     *
     * The default is `'constrain'`.
     */
    var overflow: Overflow?
}
