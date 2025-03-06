package js.temporal

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.iterable.JsIterable
import js.objects.JsPlainObject
import js.objects.Record
import kotlin.js.definedExternally

sealed external interface CalendarProtocol
    : CalendarLike {
    /* var */ val id: String
    fun year(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | string
        */
    ): Int

    fun month(
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

    fun monthCode(
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

    fun day(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainMonthDay
        | PlainDateLike
        | String
        */
    ): Int

    fun era(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): String?

    fun eraYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int?

    fun dayOfWeek(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun dayOfYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun weekOfYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun yearOfWeek(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun daysInWeek(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun daysInMonth(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    fun daysInYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    fun monthsInYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    fun inLeapYear(
        date: JsAny,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Boolean

    fun dateFromFields(
        fields: DateFromFields,
        options: AssignmentOptions = definedExternally,
    ): PlainDate

    @JsPlainObject
    interface DateFromFields :
        YearOrEraAndEraYear,
        MonthOrMonthCode {
        val day: Int
    }

    fun yearMonthFromFields(
        fields: YearMonthFromFields,
        options: AssignmentOptions = definedExternally,
    ): PlainYearMonth

    @JsPlainObject
    interface YearMonthFromFields :
        YearOrEraAndEraYear,
        MonthOrMonthCode

    fun monthDayFromFields(
        fields: MonthDayFromFields,
        options: AssignmentOptions = definedExternally,
    ): PlainMonthDay

    @JsPlainObject
    interface MonthDayFromFields :
        MonthCodeOrMonthAndYear {
        val day: Int
    }

    fun dateAdd(
        date: PlainDate, /* | PlainDateLike | string */
        duration: Duration, /* | DurationLike | string */
        options: ArithmeticOptions = definedExternally,
    ): PlainDate

    fun dateUntil(
        one: PlainDate, /* | PlainDateLike | string */
        two: PlainDate, /* | PlainDateLike | string */
        options: DifferenceOptions<DateUnit<*>> = definedExternally,
    ): Duration

    fun fields(fields: JsIterable<JsString>): JsIterable<JsString>
    fun fields(fields: ReadonlyArray<JsString>): JsIterable<JsString>
    fun mergeFields(
        fields: Record<JsString, *>,
        additionalFields: Record<JsString, *>,
    ): Record<JsString, *>
    // toString?(): string;
    // toJSON?(): string;
}
