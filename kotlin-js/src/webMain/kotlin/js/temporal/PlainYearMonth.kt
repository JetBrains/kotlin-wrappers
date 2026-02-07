package js.temporal

import kotlinx.js.JsPlainObject
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * A `Temporal.PlainYearMonth` represents a particular month on the calendar. For
 * example, it could be used to represent a particular instance of a monthly
 * recurring event, like "the June 2019 meeting".
 *
 * See https://tc39.es/proposal-temporal/docs/yearmonth.html for more details.
 */
@JsQualifier("Temporal")
external class PlainYearMonth(
    isoYear: Int,
    isoMonth: Int,
    calendar: Calendar = definedExternally,
    referenceISODay: Int = definedExternally,
) : HasArithmeticOperations<PlainYearMonth, PlainYearMonthLike, DateUnit<* /* year..month */>>,
    LocalizableDateTime {
    var era: String?
    var eraYear: Int?
    var year: Int
    var month: Int
    var monthCode: String
    var calendarId: String
    var daysInMonth: Int
    var daysInYear: Int
    var monthsInYear: Int
    var inLeapYear: Boolean

    // fun equals(other: Temporal.PlainYearMonth | PlainYearMonthLike | String): Boolean;
    fun with(
        yearMonthLike: PlainYearMonthLike,
        options: AssignmentOptions = definedExternally,
    ): PlainYearMonth

    fun toPlainDate(options: ToPlainDateOptions): PlainDate

    @JsPlainObject
    interface ToPlainDateOptions {
        var day: Int
    }

    fun getISOFields(): PlainDateISOFields
    fun toJSON(): String
    fun toString(options: ShowCalendarOption = definedExternally): String

    companion object :
        PlainCompanion<PlainYearMonth, PlainYearMonthLike>
}
