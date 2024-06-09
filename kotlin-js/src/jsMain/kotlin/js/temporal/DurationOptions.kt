package js.temporal

import kotlinx.js.JsPlainObject

/**
 * Options for assigning fields using `Duration.prototype.with()` or entire
 * objects with `Duration.from()`, and for arithmetic with
 * `Duration.prototype.add()` and `Duration.prototype.subtract()`.
 */
@JsPlainObject
sealed external interface DurationOptions {
    /**
     * How to deal with out-of-range values
     *
     * - In `'constrain'` mode, out-of-range values are clamped to the nearest
     *   in-range value.
     * - In `'balance'` mode, out-of-range values are resolved by balancing them
     *   with the next highest unit.
     *
     * The default is `'constrain'`.
     */
    var overflow: String? /* "constrain" | "balance" */
}
