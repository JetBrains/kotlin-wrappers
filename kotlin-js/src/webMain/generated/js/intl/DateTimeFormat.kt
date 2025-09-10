// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray
import js.core.BigInt
import js.core.Int53
import js.date.Date
import kotlin.js.JsQualifier
import kotlin.js.JsString
import kotlin.js.definedExternally

open external class DateTimeFormat(
    locales: String = definedExternally,
    options: DateTimeFormatOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<JsString>,
        options: DateTimeFormatOptions = definedExternally,
    )

    fun format(date: Date = definedExternally): String
    fun format(date: Int53): String
    fun resolvedOptions(): ResolvedDateTimeFormatOptions
    fun formatToParts(date: Date = definedExternally): ReadonlyArray<DateTimeFormatPart>
    fun formatToParts(date: Int53): ReadonlyArray<DateTimeFormatPart>
    fun formatRange(
        startDate: Date,
        endDate: Date,
    ): String

    fun formatRange(
        startDate: Int53,
        endDate: Int53,
    ): String

    fun formatRange(
        startDate: BigInt,
        endDate: BigInt,
    ): String

    fun formatRangeToParts(
        startDate: Date,
        endDate: Date,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    fun formatRangeToParts(
        startDate: Int53,
        endDate: Int53,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    fun formatRangeToParts(
        startDate: BigInt,
        endDate: BigInt,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    companion object {
        fun supportedLocalesOf(
            locales: String,
            options: DateTimeFormatOptions = definedExternally,
        ): ReadonlyArray<JsString>

        fun supportedLocalesOf(
            locales: ReadonlyArray<JsString>,
            options: DateTimeFormatOptions = definedExternally,
        ): ReadonlyArray<JsString>
    }
}
