// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray
import js.core.BigInt
import js.core.JsLong
import js.core.JsString
import js.date.Date
import js.import.JsQualifier
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
    fun format(date: JsLong): String
    fun resolvedOptions(): ResolvedDateTimeFormatOptions
    fun formatToParts(date: Date = definedExternally): ReadonlyArray<DateTimeFormatPart>
    fun formatToParts(date: JsLong): ReadonlyArray<DateTimeFormatPart>
    fun formatRange(
        startDate: Date,
        endDate: Date,
    ): String

    fun formatRange(
        startDate: JsLong,
        endDate: JsLong,
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
        startDate: JsLong,
        endDate: JsLong,
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
