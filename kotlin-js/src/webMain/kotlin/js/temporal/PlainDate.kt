package js.temporal

/**
 * A `Temporal.PlainDate` represents a calendar date. "Calendar date" refers to the
 * concept of a date as expressed in everyday usage, independent of any time
 * zone. For example, it could be used to represent an event on a calendar
 * which happens during the whole day no matter which time zone it's happening
 * in.
 *
 * See https://tc39.es/proposal-temporal/docs/date.html for more details.
 */
@JsQualifier("Temporal")
open external class PlainDate(
    isoYear: Int,
    isoMonth: Int,
    isoDay: Int,
    calendar: Calendar = definedExternally,
) : HasArithmeticOperations<PlainDate, PlainDateLike, DateUnit<*>>,
    LocalizableDateTime {
    open val era: String?
    open val eraYear: Int?
    open val year: Int
    open val month: Int
    open val monthCode: String
    open val day: Int
    open val calendarId: Calendar
    open val dayOfWeek: Int
    open val dayOfYear: Int
    open val weekOfYear: Int
    open val yearOfWeek: Int
    open val daysInWeek: Int
    open val daysInYear: Int
    open val daysInMonth: Int
    open val monthsInYear: Int
    open val inLeapYear: Boolean

    // fun equals(other: PlainDate /* | PlainDateLike | string */): Boolean
    open fun with(
        dateLike: PlainDateLike,
        options: AssignmentOptions = definedExternally,
    ): PlainDate

    open fun withCalendar(calendar: Calendar): PlainDate

    open fun toPlainDateTime(
        temporalTime: PlainTime /* | PlainTimeLike | string */ = definedExternally,
    ): PlainDateTime

    open fun toZonedDateTime(
        timeZoneAndTime: JsAny,
        /*
            | TimeZoneProtocol
            | string
            | {
                timeZone: TimeZoneLike;
                plainTime ?: PlainTime | PlainTimeLike | string;
            },
        */
    ): ZonedDateTime

    open fun toPlainYearMonth(): PlainYearMonth
    open fun toPlainMonthDay(): PlainMonthDay
    open fun getISOFields(): PlainDateISOFields

    open fun toJSON(): String
    open fun toString(options: ShowCalendarOption = definedExternally): String

    companion object :
        PlainCompanion<PlainDate, PlainDateLike>
}
