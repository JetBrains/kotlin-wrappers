// Automatically generated - do not modify!

package js.intl

sealed external interface DateTimeFormatOptions {
    var localeMatcher: String /* "best fit" | "lookup" */?
    var weekday: String /* "long" | "short" | "narrow" */?
    var era: String /* "long" | "short" | "narrow" */?
    var year: String /* "numeric" | "2-digit" */?
    var month: String /* "numeric" | "2-digit" | "long" | "short" | "narrow" */?
    var day: String /* "numeric" | "2-digit" */?
    var hour: String /* "numeric" | "2-digit" */?
    var minute: String /* "numeric" | "2-digit" */?
    var second: String /* "numeric" | "2-digit" */?
    var timeZoneName: String /* "short" | "long" | "shortOffset" | "longOffset" | "shortGeneric" | "longGeneric" */?
    var formatMatcher: String /* "best fit" | "basic" */?
    var hour12: Boolean?
    var timeZone: String?
    var calendar: String?
    var dayPeriod: String /* "narrow" | "short" | "long" */?
    var numberingSystem: String?
    var dateStyle: String /* "full" | "long" | "medium" | "short" */?
    var timeStyle: String /* "full" | "long" | "medium" | "short" */?
    var hourCycle: String /* "h11" | "h12" | "h23" | "h24" */?
    var fractionalSecondDigits: Int /* 1 | 2 | 3 */?
}
