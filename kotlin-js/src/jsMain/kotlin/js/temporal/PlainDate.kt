@file:JsQualifier("Temporal")

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
external class PlainDate(
    isoYear: Int,
    isoMonth: Int,
    isoDay: Int,
    calendar: CalendarLike = definedExternally,
) : LocalizableDateTime {
    val era: String?
    val eraYear: Int?
    val year: Int
    val month: Int
    val monthCode: String
    val day: Int
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

    // fun equals(other: PlainDate /* | PlainDateLike | string */): Boolean
    fun with(
        dateLike: PlainDateLike,
        options: AssignmentOptions = definedExternally,
    ): PlainDate

    fun withCalendar(calendar: CalendarLike): PlainDate
    fun add(
        durationLike: Duration, /* | DurationLike | string */
        options: ArithmeticOptions = definedExternally,
    ): PlainDate

    fun subtract(
        durationLike: Duration, /* | DurationLike | string */
        options: ArithmeticOptions = definedExternally,
    ): PlainDate

    fun until(
        other: PlainDate, /* | PlainDateLike | string */
        options: DifferenceOptions<DateUnit<*>> = definedExternally,
    ): Duration

    fun since(
        other: PlainDate, /* | PlainDateLike | string */
        options: DifferenceOptions<DateUnit<*>> = definedExternally,
    ): Duration

    fun toPlainDateTime(
        temporalTime: PlainTime /* | PlainTimeLike | string */ = definedExternally,
    ): PlainDateTime

    fun toZonedDateTime(
        timeZoneAndTime: Any,
        /*
            | TimeZoneProtocol
            | string
            | {
                timeZone: TimeZoneLike;
                plainTime ?: PlainTime | PlainTimeLike | string;
            },
        */
    ): ZonedDateTime

    fun toPlainYearMonth(): PlainYearMonth
    fun toPlainMonthDay(): PlainMonthDay
    fun getISOFields(): PlainDateISOFields

    fun toJSON(): String
    fun toString(options: ShowCalendarOption = definedExternally): String

    companion object :
        PlainCompanion<PlainDate, PlainDateLike>
}
