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
@JsQualifier("Temporal")
open external class PlainDateTime(
    isoYear: Int,
    isoMonth: Int,
    isoDay: Int,
    hour: Int = definedExternally,
    minute: Int = definedExternally,
    second: Int = definedExternally,
    millisecond: Int = definedExternally,
    microsecond: Int = definedExternally,
    nanosecond: Int = definedExternally,
    calendar: Calendar = definedExternally,
) : HasArithmeticOperations<PlainDateTime, PlainDateTimeLike, DateTimeUnit<*>>,
    Roundable<PlainDateTime, DateTimeUnit<* /* day..nanosecond */>>,
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
    open val calendarId: String
    open val dayOfWeek: Int
    open val dayOfYear: Int
    open val weekOfYear: Int
    open val yearOfWeek: Int
    open val daysInWeek: Int
    open val daysInYear: Int
    open val daysInMonth: Int
    open val monthsInYear: Int
    open val inLeapYear: Boolean

    // fun equals(other: Temporal.PlainDateTime | PlainDateTimeLike | String): Boolean
    open fun with(
        dateTimeLike: PlainDateTimeLike,
        options: AssignmentOptions = definedExternally,
    ): PlainDateTime

    open fun withPlainTime(
        timeLike: PlainTime /* | PlainTimeLike | string */ = definedExternally,
    ): PlainDateTime

    open fun withPlainDate(
        dateLike: PlainDate, /* | PlainDateLike | string */
    ): PlainDateTime

    open fun withCalendar(calendar: Calendar): PlainDateTime

    open fun toZonedDateTime(
        tzLike: TimeZone,
        options: ToInstantOptions = definedExternally,
    ): ZonedDateTime

    open fun toPlainDate(): PlainDate
    open fun toPlainYearMonth(): PlainYearMonth
    open fun toPlainMonthDay(): PlainMonthDay
    open fun toPlainTime(): PlainTime
    open fun getISOFields(): PlainDateTimeISOFields

    open fun toJSON(): String
    open fun toString(options: CalendarTypeToStringOptions = definedExternally): String

    companion object :
        PlainCompanion<PlainDateTime, PlainDateTimeLike>
}
