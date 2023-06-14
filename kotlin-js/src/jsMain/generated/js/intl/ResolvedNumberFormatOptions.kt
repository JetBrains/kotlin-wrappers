// Automatically generated - do not modify!

package js.intl

sealed external interface ResolvedNumberFormatOptions {
    var locale: String
    var numberingSystem: String
    var style: String
    var currency: String?
    var minimumIntegerDigits: Int
    var minimumFractionDigits: Int
    var maximumFractionDigits: Int
    var minimumSignificantDigits: Int?
    var maximumSignificantDigits: Int?
    var useGrouping: Boolean
    var compactDisplay: String /* "short" | "long" */?
    var notation: String /* "standard" | "scientific" | "engineering" | "compact" */?
    var signDisplay: String /* "auto" | "never" | "always" | "exceptZero" */?
    var unit: String?
    var unitDisplay: String /* "short" | "long" | "narrow" */?
    var currencyDisplay: String?
    var currencySign: String?
}
