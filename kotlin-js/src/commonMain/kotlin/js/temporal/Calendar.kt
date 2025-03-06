@file:JsQualifier("Temporal")

package js.temporal

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.import.JsQualifier
import js.iterable.JsIterable
import js.objects.Record
import js.temporal.CalendarProtocol.*

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
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | string
        */
    ): Int

    override fun month(
        date: JsAny,
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
        date: JsAny,
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
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainMonthDay
        | PlainDateLike
        | String
        */
    ): Int

    override fun era(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): String?

    override fun eraYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int?

    override fun dayOfWeek(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun dayOfYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun weekOfYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun yearOfWeek(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun daysInWeek(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    override fun daysInMonth(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    override fun daysInYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    override fun monthsInYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    override fun inLeapYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Boolean

    override fun dateFromFields(
        fields: DateFromFields,
        options: AssignmentOptions, /* = definedExternally */
    ): PlainDate

    override fun yearMonthFromFields(
        fields: YearMonthFromFields,
        options: AssignmentOptions, /* = definedExternally */
    ): PlainYearMonth

    override fun monthDayFromFields(
        fields: MonthDayFromFields,
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

    override fun fields(fields: JsIterable<JsString>): /* Array */ JsIterable<JsString>
    override fun fields(fields: ReadonlyArray<JsString>): /* Array */ JsIterable<JsString>
    override fun mergeFields(
        fields: Record<JsString, *>,
        additionalFields: Record<JsString, *>,
    ): Record<JsString, *>

    fun toJSON(): String

    companion object {
        fun from(
            item: CalendarLike,
        ): /* Calendar | */ CalendarProtocol
    }
}
