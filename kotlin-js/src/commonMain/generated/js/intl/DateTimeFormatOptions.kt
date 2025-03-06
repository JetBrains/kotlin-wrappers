// Automatically generated - do not modify!

package js.intl

import js.core.JsAnyMarker
import js.objects.JsPlainObject

@JsPlainObject
external interface DateTimeFormatOptions :
    JsAnyMarker {
    val localeMatcher: LocaleMatcher?
    val weekday: WeekdayFormat?
    val era: EraFormat?
    val year: YearFormat?
    val month: MonthFormat?
    val day: DayFormat?
    val hour: HourFormat?
    val minute: MinuteFormat?
    val second: SecondFormat?
    val timeZoneName: TimeZoneNameFormat?
    val formatMatcher: FormatMatcher?
    val hour12: Boolean?
    val timeZone: String?
    val calendar: String?
    val dayPeriod: DayPeriod?
    val numberingSystem: String?
    val dateStyle: DateStyle?
    val timeStyle: TimeStyle?
    val hourCycle: HourCycle?
    val fractionalSecondDigits: Int /* 1 | 2 | 3 */?
}
