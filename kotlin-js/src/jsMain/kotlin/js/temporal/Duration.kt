@file:JsQualifier("Temporal")

package js.temporal

import js.array.ReadonlyArray
import js.intl.DateTimeFormatOptions

/**
 * A `Temporal.Duration` represents an immutable duration of time which can be
 * used in date/time arithmetic.
 *
 * See https://tc39.es/proposal-temporal/docs/duration.html for more details.
 */
external class Duration(
    years: Int = definedExternally,
    months: Int = definedExternally,
    weeks: Int = definedExternally,
    days: Int = definedExternally,
    hours: Int = definedExternally,
    minutes: Int = definedExternally,
    seconds: Int = definedExternally,
    milliseconds: Int = definedExternally,
    microseconds: Int = definedExternally,
    nanoseconds: Int = definedExternally,
) {
    val sign: Int /* -1 | 0 | 1 */
    val blank: Boolean
    val years: Int
    val months: Int
    val weeks: Int
    val days: Int
    val hours: Int
    val minutes: Int
    val seconds: Int
    val milliseconds: Int
    val microseconds: Int
    val nanoseconds: Int
    fun negated(): Duration
    fun abs(): Duration
    fun with(durationLike: DurationLike): Duration
    fun add(
        other: Duration, /* | DurationLike | string */
        options: DurationArithmeticOptions = definedExternally,
    ): Duration

    fun subtract(
        other: Duration, /* | DurationLike | string */
        options: DurationArithmeticOptions = definedExternally,
    ): Duration

    fun round(roundTo: Any /* DurationRoundTo */): Duration
    fun total(totalOf: Any /* DurationTotalOf */): Int
    fun toLocaleString(
        locales: String = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleString(
        locales: ReadonlyArray<String>,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toJSON(): String
    fun toString(options: Any /* ToStringPrecisionOptions */ = definedExternally): String

    companion object {
        fun from(
            item: Duration, /* | DurationLike | string */
        ): Duration

        fun compare(
            one: Duration, /* | DurationLike | string */
            two: Duration, /* | DurationLike | string */
            options: DurationArithmeticOptions = definedExternally,
        ): ComparisonResult
    }
}
