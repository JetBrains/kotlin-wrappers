@file:JsQualifier("Temporal")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.temporal

/**
 * A `Temporal.PlainTime` represents a wall-clock time, with a precision in
 * nanoseconds, and without any time zone. "Wall-clock time" refers to the
 * concept of a time as expressed in everyday usage — the time that you read
 * off the clock on the wall. For example, it could be used to represent an
 * event that happens daily at a certain time, no matter what time zone.
 *
 * `Temporal.PlainTime` refers to a time with no associated calendar date; if you
 * need to refer to a specific time on a specific day, use
 * `Temporal.PlainDateTime`. A `Temporal.PlainTime` can be converted into a
 * `Temporal.PlainDateTime` by combining it with a `Temporal.PlainDate` using the
 * `toPlainDateTime()` method.
 *
 * See https://tc39.es/proposal-temporal/docs/time.html for more details.
 */
external class PlainTime(
    val hour: Int = definedExternally,
    val minute: Int = definedExternally,
    val second: Int = definedExternally,
    val millisecond: Int = definedExternally,
    val microsecond: Int = definedExternally,
    val nanosecond: Int = definedExternally,
) : HasArithmeticOperations<PlainTime, PlainTimeLike, TimeUnit<*>>,
    LocalizableDateTime {

    // fun equals(other: PlainTime /* | PlainTimeLike | string */): Boolean;
    fun with(
        timeLike: PlainTime, /* | PlainTimeLike */
        options: AssignmentOptions = definedExternally,
    ): PlainTime

    fun round(
        roundTo: RoundTo<TimeUnit<*>>,
    ): PlainTime

    fun toPlainDateTime(
        temporalDate: PlainDate, /* | PlainDateLike | string */
    ): PlainDateTime

    fun toZonedDateTime(
        timeZoneAndDate: Any,
        /*
        {
            timeZone: TimeZoneLike;
            plainDate: PlainDate | PlainDateLike | string;
        }
        */
    ): ZonedDateTime

    fun getISOFields(): PlainTimeISOFields

    fun toJSON(): String
    fun toString(options: ToStringPrecisionOptions = definedExternally): String

    companion object :
        PlainCompanion<PlainTime, PlainTimeLike>
}
