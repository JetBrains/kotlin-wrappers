// Automatically generated - do not modify!

package js.intl

sealed external interface ResolvedDateTimeFormatOptions {
    var locale: String
    var calendar: String
    var numberingSystem: String
    var timeZone: String
    var hour12: Boolean?
    var weekday: String?
    var era: String?
    var year: String?
    var month: String?
    var day: String?
    var hour: String?
    var minute: String?
    var second: String?
    var timeZoneName: String?
    var formatMatcher: String /* "best fit" | "basic" */?
    var dateStyle: String /* "full" | "long" | "medium" | "short" */?
    var timeStyle: String /* "full" | "long" | "medium" | "short" */?
    var hourCycle: String /* "h11" | "h12" | "h23" | "h24" */?
    var dayPeriod: String /* "narrow" | "short" | "long" */?
    var fractionalSecondDigits: Int /* 1 | 2 | 3 */?
}
