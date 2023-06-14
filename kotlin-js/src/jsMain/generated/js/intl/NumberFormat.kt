// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.core.BigInt
import js.core.ReadonlyArray

external class NumberFormat(
    locales: String = definedExternally,
    options: NumberFormatOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<String>,
        options: NumberFormatOptions = definedExternally,
    )

    fun format(value: Number): String
    fun resolvedOptions(): ResolvedNumberFormatOptions
    fun formatToParts(number: Number = definedExternally): ReadonlyArray<NumberFormatPart>
    fun formatToParts(number: BigInt): ReadonlyArray<NumberFormatPart>
    fun formatRange(
        start: Number,
        end: Number,
    ): String

    fun formatRange(
        start: BigInt,
        end: BigInt,
    ): String

    fun formatRangeToParts(
        start: Number,
        end: Number,
    ): ReadonlyArray<NumberRangeFormatPart>

    fun formatRangeToParts(
        start: BigInt,
        end: BigInt,
    ): ReadonlyArray<NumberRangeFormatPart>
}
