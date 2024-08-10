// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray
import js.core.BigInt

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
    fun format(value: BigInt): String
    fun format(value: StringNumericLiteral): String
    fun formatToParts(value: Number): ReadonlyArray<NumberFormatPart>
    fun formatToParts(value: BigInt): ReadonlyArray<NumberFormatPart>
    fun formatToParts(value: StringNumericLiteral): ReadonlyArray<NumberFormatPart>
    fun formatRange(
        start: Number,
        end: Number,
    ): String

    fun formatRange(
        start: BigInt,
        end: BigInt,
    ): String

    fun formatRange(
        start: StringNumericLiteral,
        end: StringNumericLiteral,
    ): String

    fun formatRangeToParts(
        start: Number,
        end: Number,
    ): ReadonlyArray<NumberRangeFormatPart>

    fun formatRangeToParts(
        start: BigInt,
        end: BigInt,
    ): ReadonlyArray<NumberRangeFormatPart>

    fun formatRangeToParts(
        start: StringNumericLiteral,
        end: StringNumericLiteral,
    ): ReadonlyArray<NumberRangeFormatPart>

    companion object {
        fun supportedLocalesOf(
            locales: String,
            options: NumberFormatOptions = definedExternally,
        ): ReadonlyArray<String>

        fun supportedLocalesOf(
            locales: ReadonlyArray<String>,
            options: NumberFormatOptions = definedExternally,
        ): ReadonlyArray<String>
    }
}
