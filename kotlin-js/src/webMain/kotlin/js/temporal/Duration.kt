package js.temporal

/**
 * A `Temporal.Duration` represents an immutable duration of time which can be
 * used in date/time arithmetic.
 *
 * See https://tc39.es/proposal-temporal/docs/duration.html for more details.
 */
@JsQualifier("Temporal")
open external class Duration(
    open val years: Int = definedExternally,
    open val months: Int = definedExternally,
    open val weeks: Int = definedExternally,
    open val days: Int = definedExternally,
    open val hours: Int = definedExternally,
    open val minutes: Int = definedExternally,
    open val seconds: Int = definedExternally,
    open val milliseconds: Int = definedExternally,
    open val microseconds: Int = definedExternally,
    open val nanoseconds: Int = definedExternally,
) : HasDurationOperations<Duration, DurationArithmeticOptions>,
    LocalizableDateTime {
    open val sign: Int /* -1 | 0 | 1 */
    open val blank: Boolean
    open fun negated(): Duration

    @JsName("negated")
    operator fun unaryMinus(): Duration
    open fun abs(): Duration
    open fun with(durationLike: DurationLike): Duration

    open fun round(roundTo: JsAny /* DurationRoundTo */): Duration
    open fun total(totalOf: JsAny /* DurationTotalOf */): Int

    open fun toJSON(): String
    open fun toString(options: ToStringPrecisionOptions = definedExternally): String

    companion object :
        Factory<Duration, DurationLike, Nothing> {

        fun compare(
            one: Duration, /* | DurationLike | string */
            two: Duration, /* | DurationLike | string */
            options: DurationArithmeticOptions = definedExternally,
        ): ComparisonResult
    }
}
