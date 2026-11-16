// Automatically generated - do not modify!

package js.intl

import js.array.ReadonlyArray
import js.numbers.BigInt

@JsQualifier("Intl")
open external class NumberFormat(
    locales: String = definedExternally,
    options: NumberFormatOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<JsString>,
        options: NumberFormatOptions = definedExternally,
    )

    open fun format(value: Double): String
    open fun resolvedOptions(): ResolvedNumberFormatOptions
    open fun format(value: BigInt): String
    open fun format(value: StringNumericLiteral): String
    open fun formatToParts(value: Double): ReadonlyArray<NumberFormatPart>
    open fun formatToParts(value: BigInt): ReadonlyArray<NumberFormatPart>
    open fun formatToParts(value: StringNumericLiteral): ReadonlyArray<NumberFormatPart>
    open fun formatRange(
        start: Double,
        end: Double,
    ): String

    open fun formatRange(
        start: BigInt,
        end: BigInt,
    ): String

    open fun formatRange(
        start: StringNumericLiteral,
        end: StringNumericLiteral,
    ): String

    open fun formatRangeToParts(
        start: Double,
        end: Double,
    ): ReadonlyArray<NumberRangeFormatPart>

    open fun formatRangeToParts(
        start: BigInt,
        end: BigInt,
    ): ReadonlyArray<NumberRangeFormatPart>

    open fun formatRangeToParts(
        start: StringNumericLiteral,
        end: StringNumericLiteral,
    ): ReadonlyArray<NumberRangeFormatPart>

    companion object {
        fun supportedLocalesOf(
            locales: String,
            options: NumberFormatOptions = definedExternally,
        ): ReadonlyArray<JsString>

        fun supportedLocalesOf(
            locales: ReadonlyArray<JsString>,
            options: NumberFormatOptions = definedExternally,
        ): ReadonlyArray<JsString>
    }
}
