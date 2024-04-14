@file:JsQualifier("Temporal")

package js.temporal

import js.core.BigInt

external class ZonedDateTime(
    epochNanoseconds: BigInt,
    timeZone: TimeZoneLike,
    calendar: CalendarLike = definedExternally,
) : HasArithmeticOperations<ZonedDateTime, ZonedDateTimeLike, DateTimeUnit<*>>,
    Roundable<ZonedDateTime, DateTimeUnit<* /* day..nanosecond */>>,
    LocalizableDateTime {
    val era: String?
    val eraYear: Int?
    val year: Int
    val month: Int
    val monthCode: String
    val day: Int
    val hour: Int
    val minute: Int
    val second: Int
    val millisecond: Int
    val microsecond: Int
    val nanosecond: Int
    val timeZoneId: String
    fun getTimeZone(): TimeZoneProtocol
    val calendarId: String
    fun getCalendar(): CalendarProtocol
    val dayOfWeek: Int
    val dayOfYear: Int
    val weekOfYear: Int
    val yearOfWeek: Int
    val hoursInDay: Int
    val daysInWeek: Int
    val daysInMonth: Int
    val daysInYear: Int
    val monthsInYear: Int
    val inLeapYear: Boolean
    val offsetNanoseconds: Int
    val offset: String
    val epochSeconds: Int
    val epochMilliseconds: Int
    val epochMicroseconds: BigInt
    val epochNanoseconds: BigInt

    // fun equals(other: ZonedDateTime | ZonedDateTimeLike | String): Boolean;
    fun with(
        zonedDateTimeLike: ZonedDateTimeLike,
        options: ZonedDateTimeAssignmentOptions = definedExternally,
    ): ZonedDateTime

    fun withPlainTime(
        timeLike: PlainTime /* | PlainTimeLike | string */ = definedExternally,
    ): ZonedDateTime

    fun withPlainDate(
        dateLike: PlainDate, /* | PlainDateLike | string */
    ): ZonedDateTime

    fun withCalendar(calendar: CalendarLike): ZonedDateTime
    fun withTimeZone(timeZone: TimeZoneLike): ZonedDateTime

    fun startOfDay(): ZonedDateTime
    fun toInstant(): Instant
    fun toPlainDateTime(): PlainDateTime
    fun toPlainDate(): PlainDate
    fun toPlainYearMonth(): PlainYearMonth
    fun toPlainMonthDay(): PlainMonthDay
    fun toPlainTime(): PlainTime
    fun getISOFields(): ZonedDateTimeISOFields
    fun toJSON(): String
    fun toString(options: ZonedDateTimeToStringOptions = definedExternally): String

    companion object :
        Factory<ZonedDateTime, ZonedDateTimeLike, ZonedDateTimeAssignmentOptions>,
        Comparator<ZonedDateTime, ZonedDateTimeLike>
}
