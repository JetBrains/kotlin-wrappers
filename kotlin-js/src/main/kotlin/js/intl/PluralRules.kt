// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import kotlinx.js.ReadonlyArray

external class PluralRules(
    locales: String = definedExternally,
    options: PluralRulesOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<String>,
        options: PluralRulesOptions = definedExternally,
    )

    fun resolvedOptions(): ResolvedPluralRulesOptions
    fun select(n: Number): LDMLPluralRule
}
