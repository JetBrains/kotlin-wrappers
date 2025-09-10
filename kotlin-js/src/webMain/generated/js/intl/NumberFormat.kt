// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray
import js.core.BigInt
import kotlin.js.JsQualifier
import kotlin.js.JsString
import kotlin.js.definedExternally

open external class NumberFormat(
    locales: String = definedExternally,
    options: NumberFormatOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<JsString>,
        options: NumberFormatOptions = definedExternally,
    )

    fun format(value: Double): String
    fun resolvedOptions(): ResolvedNumberFormatOptions
    fun format(value: BigInt): String
    fun format(value: StringNumericLiteral): String
    fun formatToParts(value: Double): ReadonlyArray<NumberFormatPart>
    fun formatToParts(value: BigInt): ReadonlyArray<NumberFormatPart>
    fun formatToParts(value: StringNumericLiteral): ReadonlyArray<NumberFormatPart>
    fun formatRange(
        start: Double,
        end: Double,
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
        start: Double,
        end: Double,
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
        ): ReadonlyArray<JsString>

        fun supportedLocalesOf(
            locales: ReadonlyArray<JsString>,
            options: NumberFormatOptions = definedExternally,
        ): ReadonlyArray<JsString>
    }
}
