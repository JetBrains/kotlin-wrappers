// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray
import js.core.JsString
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

open external class PluralRules(
    locales: String = definedExternally,
    options: PluralRulesOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<JsString>,
        options: PluralRulesOptions = definedExternally,
    )

    fun resolvedOptions(): ResolvedPluralRulesOptions
    fun select(n: Int): LDMLPluralRule

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
