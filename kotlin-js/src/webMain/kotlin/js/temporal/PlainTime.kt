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
@JsQualifier("Temporal")
open external class PlainTime(
    open val hour: Int = definedExternally,
    open val minute: Int = definedExternally,
    open val second: Int = definedExternally,
    open val millisecond: Int = definedExternally,
    open val microsecond: Int = definedExternally,
    open val nanosecond: Int = definedExternally,
) : HasArithmeticOperations<PlainTime, PlainTimeLike, TimeUnit<*>>,
    Roundable<PlainTime, TimeUnit<*>>,
    LocalizableDateTime {

    // fun equals(other: PlainTime /* | PlainTimeLike | string */): Boolean;
    open fun with(
        timeLike: PlainTime, /* | PlainTimeLike */
        options: AssignmentOptions = definedExternally,
    ): PlainTime

    open fun toPlainDateTime(
        temporalDate: PlainDate, /* | PlainDateLike | string */
    ): PlainDateTime

    open fun toZonedDateTime(
        timeZoneAndDate: JsAny,
        /*
        {
            timeZone: TimeZoneLike;
            plainDate: PlainDate | PlainDateLike | string;
        }
        */
    ): ZonedDateTime

    open fun getISOFields(): PlainTimeISOFields

    open fun toJSON(): String
    open fun toString(options: ToStringPrecisionOptions = definedExternally): String

    companion object :
        PlainCompanion<PlainTime, PlainTimeLike>
}
