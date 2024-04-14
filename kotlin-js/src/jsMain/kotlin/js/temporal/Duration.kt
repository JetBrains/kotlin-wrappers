@file:JsQualifier("Temporal")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.temporal

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
    fun abs(): Duration
    fun with(durationLike: DurationLike): Duration

    fun round(roundTo: Any /* DurationRoundTo */): Duration
    fun total(totalOf: Any /* DurationTotalOf */): Int

    fun toJSON(): String
    fun toString(options: ToStringPrecisionOptions = definedExternally): String

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
