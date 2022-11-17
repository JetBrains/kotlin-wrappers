// Automatically generated - do not modify!

package web.intl

sealed external interface DateTimeFormatOptions {
    var calendar: String?
    var dayPeriod: String /* "narrow" | "short" | "long" */?
    var numberingSystem: String?
    var dateStyle: String /* "full" | "long" | "medium" | "short" */?
    var timeStyle: String /* "full" | "long" | "medium" | "short" */?
    var hourCycle: String /* "h11" | "h12" | "h23" | "h24" */?
    var formatMatcher: String /* "basic" | "best fit" | "best fit" */?
    var fractionalSecondDigits: Int /* fractionalSecondDigits?: 1 | 2 | 3 | undefined */?
}
