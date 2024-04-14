package js.temporal

import js.objects.JsPlainObject

/**
 * `round` methods take one required parameter. If a string is provided, the
 * resulting `Temporal.Duration` object will be rounded to that unit. If an
 * object is provided, its `smallestUnit` property is required while other
 * properties are optional. A string is treated the same as an object whose
 * `smallestUnit` property value is that string.
 */
@JsPlainObject
sealed external interface RoundTo<T : DateTimeUnit<T>> {
    /**
     * The unit to round to. For example, to round to the nearest minute,
     * use `smallestUnit: 'minute'`. This option is required. Note that the
     * same-named property is optional when passed to `until` or `since`
     * methods, because those methods do no rounding by default.
     */
    var smallestUnit: SmallestUnit<T>

    /**
     * Allows rounding to an integer number of units. For example, to round to
     * increments of a half hour, use `{ smallestUnit: 'minute',
     * roundingIncrement: 30 }`.
     */
    var roundingIncrement: Int?

    /**
     * Controls how rounding is performed:
     * - `halfExpand`: Round to the nearest of the values allowed by
     *   `roundingIncrement` and `smallestUnit`. When there is a tie, round up.
     *   This mode is the default.
     * - `ceil`: Always round up, towards the end of time.
     * - `trunc`: Always round down, towards the beginning of time.
     * - `floor`: Also round down, towards the beginning of time. This mode acts
     *   the same as `trunc`, but it's included for consistency with
     *   `Temporal.Duration.round()` where negative values are allowed and
     *   `trunc` rounds towards zero, unlike `floor` which rounds towards
     *   negative infinity which is usually unexpected. For this reason, `trunc`
     *   is recommended for most use cases.
     */
    var roundingMode: RoundingMode?
}
