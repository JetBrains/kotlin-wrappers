// Automatically generated - do not modify!

package js.intl

import js.array.ReadonlyArray
import js.core.BigInt
import js.core.Int53
import js.date.Date
import js.temporal.*
import kotlin.js.JsQualifier
import kotlin.js.JsString
import kotlin.js.definedExternally

@JsQualifier("Intl")
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

    fun format(date: PlainDate = definedExternally): String
    fun format(date: PlainYearMonth): String
    fun format(date: PlainMonthDay): String
    fun format(date: PlainTime): String
    fun format(date: PlainDateTime): String
    fun format(date: Instant): String
    fun formatToParts(date: PlainDate = definedExternally): ReadonlyArray<DateTimeFormatPart>
    fun formatToParts(date: PlainYearMonth): ReadonlyArray<DateTimeFormatPart>
    fun formatToParts(date: PlainMonthDay): ReadonlyArray<DateTimeFormatPart>
    fun formatToParts(date: PlainTime): ReadonlyArray<DateTimeFormatPart>
    fun formatToParts(date: PlainDateTime): ReadonlyArray<DateTimeFormatPart>
    fun formatToParts(date: Instant): ReadonlyArray<DateTimeFormatPart>
    fun formatRange(
        startDate: PlainDate,
        endDate: PlainDate,
    ): String

    fun formatRange(
        startDate: PlainYearMonth,
        endDate: PlainYearMonth,
    ): String

    fun formatRange(
        startDate: PlainMonthDay,
        endDate: PlainMonthDay,
    ): String

    fun formatRange(
        startDate: PlainTime,
        endDate: PlainTime,
    ): String

    fun formatRange(
        startDate: PlainDateTime,
        endDate: PlainDateTime,
    ): String

    fun formatRange(
        startDate: Instant,
        endDate: Instant,
    ): String

    fun formatRangeToParts(
        startDate: PlainDate,
        endDate: PlainDate,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    fun formatRangeToParts(
        startDate: PlainYearMonth,
        endDate: PlainYearMonth,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    fun formatRangeToParts(
        startDate: PlainMonthDay,
        endDate: PlainMonthDay,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    fun formatRangeToParts(
        startDate: PlainTime,
        endDate: PlainTime,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    fun formatRangeToParts(
        startDate: PlainDateTime,
        endDate: PlainDateTime,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    fun formatRangeToParts(
        startDate: Instant,
        endDate: Instant,
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
