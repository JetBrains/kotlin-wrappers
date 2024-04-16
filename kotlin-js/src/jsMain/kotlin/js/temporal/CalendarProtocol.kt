package js.temporal

import js.array.ReadonlyArray
import js.iterable.JsIterable
import js.objects.JsPlainObject
import js.objects.Record

sealed external interface CalendarProtocol
    : CalendarLike {
    /* var */ val id: String
    fun year(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | string
        */
    ): Int

    fun month(
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

    fun monthCode(
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

    fun day(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainMonthDay
        | PlainDateLike
        | String
        */
    ): Int

    fun era(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): String?

    fun eraYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int?

    fun dayOfWeek(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun dayOfYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun weekOfYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun yearOfWeek(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun daysInWeek(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainDateLike
        | String
        */
    ): Int

    fun daysInMonth(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    fun daysInYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    fun monthsInYear(
        date: Any,
        /*
        | PlainDate
        | PlainDateTime
        | PlainYearMonth
        | PlainDateLike
        | String
        */
    ): Int

    fun inLeapYear(
        date: Any,
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
    sealed interface DateFromFields :
        YearOrEraAndEraYear,
        MonthOrMonthCode {
        var day: Int
    }

    fun yearMonthFromFields(
        fields: YearMonthFromFields,
        options: AssignmentOptions = definedExternally,
    ): PlainYearMonth

    @JsPlainObject
    sealed interface YearMonthFromFields :
        YearOrEraAndEraYear,
        MonthOrMonthCode

    fun monthDayFromFields(
        fields: MonthDayFromFields,
        options: AssignmentOptions = definedExternally,
    ): PlainMonthDay

    @JsPlainObject
    sealed interface MonthDayFromFields :
        MonthCodeOrMonthAndYear {
        var day: Int
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

    fun fields(fields: JsIterable<String>): JsIterable<String>
    fun fields(fields: ReadonlyArray<String>): JsIterable<String>
    fun mergeFields(
        fields: Record<String, *>,
        additionalFields: Record<String, *>,
    ): Record<String, *>
    // toString?(): string;
    // toJSON?(): string;
}
