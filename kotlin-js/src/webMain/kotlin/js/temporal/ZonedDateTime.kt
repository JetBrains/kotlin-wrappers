package js.temporal

import js.numbers.BigInt

@JsQualifier("Temporal")
open external class ZonedDateTime(
    epochNanoseconds: BigInt,
    timeZone: TimeZone,
    calendar: Calendar = definedExternally,
) : HasArithmeticOperations<ZonedDateTime, ZonedDateTimeLike, DateTimeUnit<*>>,
    Roundable<ZonedDateTime, DateTimeUnit<* /* day..nanosecond */>>,
    LocalizableDateTime {
    open val era: String?
    open val eraYear: Int?
    open val year: Int
    open val month: Int
    open val monthCode: String
    open val day: Int
    open val hour: Int
    open val minute: Int
    open val second: Int
    open val millisecond: Int
    open val microsecond: Int
    open val nanosecond: Int
    open val timeZoneId: String
    open val calendarId: String
    open val dayOfWeek: Int
    open val dayOfYear: Int
    open val weekOfYear: Int
    open val yearOfWeek: Int
    open val hoursInDay: Int
    open val daysInWeek: Int
    open val daysInMonth: Int
    open val daysInYear: Int
    open val monthsInYear: Int
    open val inLeapYear: Boolean
    open val offsetNanoseconds: Int
    open val offset: String
    open val epochSeconds: Int
    open val epochMilliseconds: Int
    open val epochMicroseconds: BigInt
    open val epochNanoseconds: BigInt

    // fun equals(other: ZonedDateTime | ZonedDateTimeLike | String): Boolean;
    open fun with(
        zonedDateTimeLike: ZonedDateTimeLike,
        options: ZonedDateTimeAssignmentOptions = definedExternally,
    ): ZonedDateTime

    open fun withPlainTime(
        timeLike: PlainTime /* | PlainTimeLike | string */ = definedExternally,
    ): ZonedDateTime

    open fun withPlainDate(
        dateLike: PlainDate, /* | PlainDateLike | string */
    ): ZonedDateTime

    open fun withCalendar(calendar: Calendar): ZonedDateTime
    open fun withTimeZone(timeZone: TimeZone): ZonedDateTime

    open fun startOfDay(): ZonedDateTime
    open fun toInstant(): Instant
    open fun toPlainDateTime(): PlainDateTime
    open fun toPlainDate(): PlainDate
    open fun toPlainYearMonth(): PlainYearMonth
    open fun toPlainMonthDay(): PlainMonthDay
    open fun toPlainTime(): PlainTime
    open fun getISOFields(): ZonedDateTimeISOFields
    open fun toJSON(): String
    open fun toString(options: ZonedDateTimeToStringOptions = definedExternally): String

    companion object :
        Factory<ZonedDateTime, ZonedDateTimeLike, ZonedDateTimeAssignmentOptions>,
        Comparator<ZonedDateTime, ZonedDateTimeLike>
}
