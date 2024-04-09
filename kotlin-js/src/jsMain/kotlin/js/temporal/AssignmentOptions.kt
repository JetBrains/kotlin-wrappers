package js.temporal

import js.objects.JsPlainObject

/**
 * Options for assigning fields using `with()` or entire objects with
 * `from()`.
 */
@JsPlainObject
sealed external interface AssignmentOptions {
    /**
     * How to deal with out-of-range values
     *
     * - In `'constrain'` mode, out-of-range values are clamped to the nearest
     *   in-range value.
     * - In `'reject'` mode, out-of-range values will cause the function to
     *   throw a RangeError.
     *
     * The default is `'constrain'`.
     */
    var overflow: String? /* "constrain" | "reject" */
}
