// Automatically generated - do not modify!

package js.intl

import kotlinx.js.ReadonlyArray

sealed external interface ResolvedPluralRulesOptions {
    var locale: String
    var pluralCategories: ReadonlyArray<LDMLPluralRule>
    var type: PluralRuleType
    var minimumIntegerDigits: Int
    var minimumFractionDigits: Int
    var maximumFractionDigits: Int
    var minimumSignificantDigits: Int?
    var maximumSignificantDigits: Int?
}
