// Automatically generated - do not modify!

package js.intl

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ResolvedNumberFormatOptions {
    val locale: String
    val numberingSystem: String
    val style: NumberFormatOptionsStyle
    val currency: String?
    val currencyDisplay: NumberFormatOptionsCurrencyDisplay?
    val minimumIntegerDigits: Int
    val minimumFractionDigits: Int?
    val maximumFractionDigits: Int?
    val minimumSignificantDigits: Int?
    val maximumSignificantDigits: Int?
    val useGrouping: ResolvedNumberFormatOptionsUseGrouping
    val compactDisplay: CompactDisplay?
    val notation: Notation
    val signDisplay: NumberFormatOptionsSignDisplay
    val unit: String?
    val unitDisplay: UnitDisplay?
    val currencySign: CurrencySign?
    val roundingPriority: RoundingPriority
    val roundingMode: RoundingMode
    val roundingIncrement: Int /* 1 | 2 | 5 | 10 | 20 | 25 | 50 | 100 | 200 | 250 | 500 | 1000 | 2000 | 2500 | 5000 */
    val trailingZeroDisplay: TrailingZeroDisplay
}
