@file:JsQualifier("Temporal")

package js.temporal

import js.array.ReadonlyArray
import js.iterable.JsIterable
import js.objects.Record

/**
 * A `Temporal.Calendar` is a representation of a calendar system. It includes
 * information about how many days are in each year, how many months are in
 * each year, how many days are in each month, and how to do arithmetic in
 * that calendar system.
 *
 * See https://tc39.es/proposal-temporal/docs/calendar.html for more details.
 */
external class Calendar(
    calendarIdentifier: String,
) : CalendarProtocol {
    override val id: String
    override fun year(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | string
        */
    ): Int

    override fun month(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainMonthDay
        | PlainDateLike
        | string
        */
    ): Int

    override fun monthCode(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainMonthDay
        | PlainDateLike
        | string
        */
    ): String

    override fun day(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainMonthDay
        | PlainDateLike
        | String
        */
    ): Int

    override fun era(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): String?

    override fun eraYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int?

    override fun dayOfWeek(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun dayOfYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun weekOfYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun yearOfWeek(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun daysInWeek(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun daysInMonth(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    override fun daysInYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    override fun monthsInYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    override fun inLeapYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Boolean

    override fun dateFromFields(
        fields: Any, /* YearOrEraAndEraYear & MonthOrMonthCode & { day: number } */
        options: AssignmentOptions, /* = definedExternally */
    ): PlainDate

    override fun yearMonthFromFields(
        fields: Any, /* YearOrEraAndEraYear & MonthOrMonthCode */
        options: AssignmentOptions, /* = definedExternally */
    ): PlainYearMonth

    override fun monthDayFromFields(
        fields: Any, /* MonthCodeOrMonthAndYear & { day: number } */
        options: AssignmentOptions, /* = definedExternally */
    ): PlainMonthDay

    override fun dateAdd(
        date: PlainDate, /* | PlainDateLike | string */
        duration: Duration, /* | DurationLike | string */
        options: ArithmeticOptions, /* = definedExternally */
    ): PlainDate

    override fun dateUntil(
        one: PlainDate, /* | PlainDateLike | string */
        two: PlainDate, /* | PlainDateLike | string */
        options: DifferenceOptions<DateUnit<*>>, /* = definedExternally */
    ): Duration

    override fun fields(fields: JsIterable<String>): /* Array */ JsIterable<String>
    override fun fields(fields: ReadonlyArray<String>): /* Array */ JsIterable<String>
    override fun mergeFields(
        fields: Record<String, *>,
        additionalFields: Record<String, *>,
    ): Record<String, *>

    fun toJSON(): String

    companion object {
        fun from(
            item: CalendarLike,
        ): /* Calendar | */ CalendarProtocol
    }
}
