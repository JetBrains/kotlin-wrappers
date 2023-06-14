// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.core.ReadonlyArray

external class Collator(
    locales: String = definedExternally,
    options: CollatorOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<String>,
        options: CollatorOptions = definedExternally,
    )

    fun compare(
        x: String,
        y: String,
    ): Number

    fun resolvedOptions(): ResolvedCollatorOptions
}
