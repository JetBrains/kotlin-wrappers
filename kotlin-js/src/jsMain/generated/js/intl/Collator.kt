// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray

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
    ): Int

    fun resolvedOptions(): ResolvedCollatorOptions
}
