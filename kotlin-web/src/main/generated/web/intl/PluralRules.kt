// Automatically generated - do not modify!

package web.intl

sealed external interface PluralRules {
    fun resolvedOptions(): ResolvedPluralRulesOptions
    fun select(n: Number): LDMLPluralRule
}
