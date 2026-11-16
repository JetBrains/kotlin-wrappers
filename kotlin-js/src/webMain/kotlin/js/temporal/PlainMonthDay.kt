package js.temporal

import kotlinx.js.JsPlainObject

/**
 * A `Temporal.PlainMonthDay` represents a particular day on the calendar, but
 * without a year. For example, it could be used to represent a yearly
 * recurring event, like "Bastille Day is on the 14th of July."
 *
 * See https://tc39.es/proposal-temporal/docs/monthday.html for more details.
 */
@JsQualifier("Temporal")
open external class PlainMonthDay(
    isoMonth: Int,
    isoDay: Int,
    calendar: Calendar = definedExternally,
    referenceISOYear: Int = definedExternally,
) : LocalizableDateTime {
    open var monthCode: String
    open var day: Int
    open var calendarId: String

    // fun equals(other: PlainMonthDay /* | PlainMonthDayLike | string */ ): Boolean
    open fun with(
        monthDayLike: PlainMonthDayLike,
        options: AssignmentOptions = definedExternally,
    ): PlainMonthDay

    open fun toPlainDate(options: ToPlainDateOptions): PlainDate

    @JsPlainObject
    interface ToPlainDateOptions {
        var year: Int
    }

    open fun getISOFields(): PlainDateISOFields

    open fun toJSON(): String
    open fun toString(options: ShowCalendarOption = definedExternally): String

    companion object :
        Factory<PlainMonthDay, PlainMonthDayLike, AssignmentOptions>
}
