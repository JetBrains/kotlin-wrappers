package js.temporal

import kotlinx.js.JsPlainObject

/**
 * Options to control behavior of `Duration.compare()`, `Duration.add()`, and
 * `Duration.subtract()`
 */
@JsPlainObject
external interface DurationArithmeticOptions {
    /**
     * The starting point to use when variable-length units (years, months,
     * weeks depending on the calendar) are involved. This option is required if
     * either of the durations has a nonzero value for `weeks` or larger units.
     *
     * This value must be either a `Temporal.PlainDateTime`, a
     * `Temporal.ZonedDateTime`, or a string or object value that can be passed
     * to `from()` of those types. Examples:
     * - `'2020-01'01T00:00-08:00[America/Los_Angeles]'`
     * - `'2020-01'01'`
     * - `Temporal.PlainDate.from('2020-01-01')`
     *
     * `Temporal.ZonedDateTime` will be tried first because it's more
     * specific, with `Temporal.PlainDateTime` as a fallback.
     *
     * If the value resolves to a `Temporal.ZonedDateTime`, then operation will
     * adjust for DST and other time zone transitions. Otherwise (including if
     * this option is omitted), then the operation will ignore time zone
     * transitions and all days will be assumed to be 24 hours long.
     */
    val relativeTo: Any? /*
        | Temporal.ZonedDateTime
        | Temporal.PlainDateTime
        | ZonedDateTimeLike
        | PlainDateTimeLike
        | string;
        */
}
