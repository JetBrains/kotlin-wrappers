package js.temporal

import kotlinx.js.JsPlainObject

/**
 * A `Temporal.PlainYearMonth` represents a particular month on the calendar. For
 * example, it could be used to represent a particular instance of a monthly
 * recurring event, like "the June 2019 meeting".
 *
 * See https://tc39.es/proposal-temporal/docs/yearmonth.html for more details.
 */
@JsQualifier("Temporal")
open external class PlainYearMonth(
    isoYear: Int,
    isoMonth: Int,
    calendar: Calendar = definedExternally,
    referenceISODay: Int = definedExternally,
) : HasArithmeticOperations<PlainYearMonth, PlainYearMonthLike, DateUnit<* /* year..month */>>,
    LocalizableDateTime {
    open var era: String?
    open var eraYear: Int?
    open var year: Int
    open var month: Int
    open var monthCode: String
    open var calendarId: String
    open var daysInMonth: Int
    open var daysInYear: Int
    open var monthsInYear: Int
    open var inLeapYear: Boolean

    // fun equals(other: Temporal.PlainYearMonth | PlainYearMonthLike | String): Boolean;
    open fun with(
        yearMonthLike: PlainYearMonthLike,
        options: AssignmentOptions = definedExternally,
    ): PlainYearMonth

    open fun toPlainDate(options: ToPlainDateOptions): PlainDate

    @JsPlainObject
    interface ToPlainDateOptions {
        var day: Int
    }

    open fun getISOFields(): PlainDateISOFields
    open fun toJSON(): String
    open fun toString(options: ShowCalendarOption = definedExternally): String

    companion object :
        PlainCompanion<PlainYearMonth, PlainYearMonthLike>
}
