// Automatically generated - do not modify!

package web.intl

sealed external interface DateTimeFormatOptions {
    var formatMatcher: String /* "basic" | "best fit" | "best fit" */?
    var dateStyle: String /* "full" | "long" | "medium" | "short" */?
    var timeStyle: String /* "full" | "long" | "medium" | "short" */?
    var dayPeriod: String /* "narrow" | "short" | "long" */?
    var fractionalSecondDigits: Int /* fractionalSecondDigits?: 1 | 2 | 3 | undefined */?
    var calendar: String?
    var numberingSystem: String?
    var hourCycle: String /* "h11" | "h12" | "h23" | "h24" */?
}
