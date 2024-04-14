@file:JsQualifier("Temporal")

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
    hour: Int = definedExternally,
    minute: Int = definedExternally,
    second: Int = definedExternally,
    millisecond: Int = definedExternally,
    microsecond: Int = definedExternally,
    nanosecond: Int = definedExternally,
) : HasArithmeticOperations<PlainTime, PlainTimeLike, TimeUnit<*>>,
    LocalizableDateTime {
    val hour: Int
    val minute: Int
    val second: Int
    val millisecond: Int
    val microsecond: Int
    val nanosecond: Int

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
