@file:JsQualifier("Temporal")

package js.temporal

/**
 * A `Temporal.PlainDateTime` represents a calendar date and wall-clock time, with
 * a precision in nanoseconds, and without any time zone. Of the Temporal
 * classes carrying human-readable time information, it is the most general
 * and complete one. `Temporal.PlainDate`, `Temporal.PlainTime`, `Temporal.PlainYearMonth`,
 * and `Temporal.PlainMonthDay` all carry less information and should be used when
 * complete information is not required.
 *
 * See https://tc39.es/proposal-temporal/docs/datetime.html for more details.
 */
external class PlainDateTime(
    isoYear: Int,
    isoMonth: Int,
    isoDay: Int,
    hour: Int = definedExternally,
    minute: Int = definedExternally,
    second: Int = definedExternally,
    millisecond: Int = definedExternally,
    microsecond: Int = definedExternally,
    nanosecond: Int = definedExternally,
    calendar: CalendarLike = definedExternally,
) : HasArithmeticOperations<PlainDateTime, PlainDateTimeLike, DateTimeUnit<*>>,
    Roundable<PlainDateTime, DateTimeUnit<* /* day..nanosecond */>>,
    LocalizableDateTime,
    CalendarLike {
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
    val calendarId: String
    fun getCalendar(): CalendarProtocol
    val dayOfWeek: Int
    val dayOfYear: Int
    val weekOfYear: Int
    val yearOfWeek: Int
    val daysInWeek: Int
    val daysInYear: Int
    val daysInMonth: Int
    val monthsInYear: Int
    val inLeapYear: Boolean

    // fun equals(other: Temporal.PlainDateTime | PlainDateTimeLike | String): Boolean
    fun with(
        dateTimeLike: PlainDateTimeLike,
        options: AssignmentOptions = definedExternally,
    ): PlainDateTime

    fun withPlainTime(
        timeLike: PlainTime /* | PlainTimeLike | string */ = definedExternally,
    ): PlainDateTime

    fun withPlainDate(
        dateLike: PlainDate, /* | PlainDateLike | string */
    ): PlainDateTime

    fun withCalendar(calendar: CalendarLike): PlainDateTime

    fun toZonedDateTime(
        tzLike: TimeZoneLike,
        options: ToInstantOptions = definedExternally,
    ): ZonedDateTime

    fun toPlainDate(): PlainDate
    fun toPlainYearMonth(): PlainYearMonth
    fun toPlainMonthDay(): PlainMonthDay
    fun toPlainTime(): PlainTime
    fun getISOFields(): PlainDateTimeISOFields

    fun toJSON(): String
    fun toString(options: CalendarTypeToStringOptions = definedExternally): String

    companion object :
        PlainCompanion<PlainDateTime, PlainDateTimeLike>
}
