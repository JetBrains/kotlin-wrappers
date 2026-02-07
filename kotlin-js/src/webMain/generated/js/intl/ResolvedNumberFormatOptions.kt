// Automatically generated - do not modify!

package js.intl

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ResolvedNumberFormatOptions {
    var locale: String
    var numberingSystem: String
    var style: NumberFormatOptionsStyle
    var currency: String?
    var currencyDisplay: NumberFormatOptionsCurrencyDisplay?
    var minimumIntegerDigits: Int
    var minimumFractionDigits: Int?
    var maximumFractionDigits: Int?
    var minimumSignificantDigits: Int?
    var maximumSignificantDigits: Int?
    var useGrouping: ResolvedNumberFormatOptionsUseGrouping
    var compactDisplay: CompactDisplay?
    var notation: Notation
    var signDisplay: NumberFormatOptionsSignDisplay
    var unit: String?
    var unitDisplay: UnitDisplay?
    var currencySign: CurrencySign?
    var roundingPriority: RoundingPriority
    var roundingMode: RoundingMode
    var roundingIncrement: Int /* 1 | 2 | 5 | 10 | 20 | 25 | 50 | 100 | 200 | 250 | 500 | 1000 | 2000 | 2500 | 5000 */
    var trailingZeroDisplay: TrailingZeroDisplay
}
