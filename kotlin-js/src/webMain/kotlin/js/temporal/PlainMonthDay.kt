package js.temporal

import js.objects.JsPlainObject
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * A `Temporal.PlainMonthDay` represents a particular day on the calendar, but
 * without a year. For example, it could be used to represent a yearly
 * recurring event, like "Bastille Day is on the 14th of July."
 *
 * See https://tc39.es/proposal-temporal/docs/monthday.html for more details.
 */
@JsQualifier("Temporal")
external class PlainMonthDay(
    isoMonth: Int,
    isoDay: Int,
    calendar: Calendar = definedExternally,
    referenceISOYear: Int = definedExternally,
) : LocalizableDateTime {
    var monthCode: String
    var day: Int
    var calendarId: String

    // fun equals(other: PlainMonthDay /* | PlainMonthDayLike | string */ ): Boolean
    fun with(
        monthDayLike: PlainMonthDayLike,
        options: AssignmentOptions = definedExternally,
    ): PlainMonthDay

    fun toPlainDate(options: ToPlainDateOptions): PlainDate

    @JsPlainObject
    interface ToPlainDateOptions {
        var year: Int
    }

    fun getISOFields(): PlainDateISOFields

    fun toJSON(): String
    fun toString(options: ShowCalendarOption = definedExternally): String

    companion object :
        Factory<PlainMonthDay, PlainMonthDayLike, AssignmentOptions>
}
