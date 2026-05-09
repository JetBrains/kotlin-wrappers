// Automatically generated - do not modify!

package js.intl

import js.array.ReadonlyArray

@JsQualifier("Intl")
open external class Collator(
    locales: String = definedExternally,
    options: CollatorOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<JsString>,
        options: CollatorOptions = definedExternally,
    )

    fun compare(
        x: String,
        y: String,
    ): Int

    fun resolvedOptions(): ResolvedCollatorOptions

    companion object {
        fun supportedLocalesOf(
            locales: String,
            options: CollatorOptions = definedExternally,
        ): ReadonlyArray<JsString>

        fun supportedLocalesOf(
            locales: ReadonlyArray<JsString>,
            options: CollatorOptions = definedExternally,
        ): ReadonlyArray<JsString>
    }
}
