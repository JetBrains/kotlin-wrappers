@file:JsQualifier("Temporal")

package js.temporal

import kotlin.js.JsAny
import kotlin.js.JsName
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * A `Temporal.Duration` represents an immutable duration of time which can be
 * used in date/time arithmetic.
 *
 * See https://tc39.es/proposal-temporal/docs/duration.html for more details.
 */
external class Duration(
    val years: Int = definedExternally,
    val months: Int = definedExternally,
    val weeks: Int = definedExternally,
    val days: Int = definedExternally,
    val hours: Int = definedExternally,
    val minutes: Int = definedExternally,
    val seconds: Int = definedExternally,
    val milliseconds: Int = definedExternally,
    val microseconds: Int = definedExternally,
    val nanoseconds: Int = definedExternally,
) : HasDurationOperations<Duration, DurationArithmeticOptions>,
    LocalizableDateTime {
    val sign: Int /* -1 | 0 | 1 */
    val blank: Boolean
    fun negated(): Duration

    @JsName("negated")
    operator fun unaryMinus(): Duration
    fun abs(): Duration
    fun with(durationLike: DurationLike): Duration

    fun round(roundTo: JsAny /* DurationRoundTo */): Duration
    fun total(totalOf: JsAny /* DurationTotalOf */): Int

    fun toJSON(): String
    fun toString(options: ToStringPrecisionOptions = definedExternally): String

    companion object :
        Factory<Duration, DurationLike, Nothing> {

        fun compare(
            one: Duration, /* | DurationLike | string */
            two: Duration, /* | DurationLike | string */
            options: DurationArithmeticOptions = definedExternally,
        ): ComparisonResult
    }
}
