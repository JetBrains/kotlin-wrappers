// Automatically generated - do not modify!

package js.intl

import js.array.ReadonlyArray

@JsQualifier("Intl")
open external class PluralRules(
    locales: String = definedExternally,
    options: PluralRulesOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<JsString>,
        options: PluralRulesOptions = definedExternally,
    )

    open fun resolvedOptions(): ResolvedPluralRulesOptions
    open fun select(n: Int): LDMLPluralRule

    companion object {
        fun supportedLocalesOf(
            locales: String,
            options: SupportedLocalesOptions = definedExternally,
        ): ReadonlyArray<JsString>

        fun supportedLocalesOf(
            locales: ReadonlyArray<JsString>,
            options: SupportedLocalesOptions = definedExternally,
        ): ReadonlyArray<JsString>
    }
}
