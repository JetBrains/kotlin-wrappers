package js.temporal

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * Options for outputting precision in toString() on types with seconds
 */
@JsPlainObject
external interface ToStringPrecisionOptions {
    val fractionalSecondDigits: JsAny? /* "auto" | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 */
    val smallestUnit: SmallestUnit<TimeUnit<*> /* "minute" | "second" | "millisecond" | "microsecond" | "nanosecond" */>?

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
    val roundingMode: RoundingMode?
}
