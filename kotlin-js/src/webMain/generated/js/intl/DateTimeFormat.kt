// Automatically generated - do not modify!

package js.intl

import js.array.ReadonlyArray
import js.date.Date
import js.numbers.BigInt
import js.numbers.Int53
import js.temporal.*

@JsQualifier("Intl")
open external class DateTimeFormat(
    locales: String = definedExternally,
    options: DateTimeFormatOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<JsString>,
        options: DateTimeFormatOptions = definedExternally,
    )

    open fun format(date: Date = definedExternally): String
    open fun format(date: Int53): String
    open fun resolvedOptions(): ResolvedDateTimeFormatOptions
    open fun formatToParts(date: Date = definedExternally): ReadonlyArray<DateTimeFormatPart>
    open fun formatToParts(date: Int53): ReadonlyArray<DateTimeFormatPart>
    open fun formatRange(
        startDate: Date,
        endDate: Date,
    ): String

    open fun formatRange(
        startDate: Int53,
        endDate: Int53,
    ): String

    open fun formatRange(
        startDate: BigInt,
        endDate: BigInt,
    ): String

    open fun formatRangeToParts(
        startDate: Date,
        endDate: Date,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun formatRangeToParts(
        startDate: Int53,
        endDate: Int53,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun formatRangeToParts(
        startDate: BigInt,
        endDate: BigInt,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun format(date: PlainDate = definedExternally): String
    open fun format(date: PlainYearMonth): String
    open fun format(date: PlainMonthDay): String
    open fun format(date: PlainTime): String
    open fun format(date: PlainDateTime): String
    open fun format(date: Instant): String
    open fun formatToParts(date: PlainDate = definedExternally): ReadonlyArray<DateTimeFormatPart>
    open fun formatToParts(date: PlainYearMonth): ReadonlyArray<DateTimeFormatPart>
    open fun formatToParts(date: PlainMonthDay): ReadonlyArray<DateTimeFormatPart>
    open fun formatToParts(date: PlainTime): ReadonlyArray<DateTimeFormatPart>
    open fun formatToParts(date: PlainDateTime): ReadonlyArray<DateTimeFormatPart>
    open fun formatToParts(date: Instant): ReadonlyArray<DateTimeFormatPart>
    open fun formatRange(
        startDate: PlainDate,
        endDate: PlainDate,
    ): String

    open fun formatRange(
        startDate: PlainYearMonth,
        endDate: PlainYearMonth,
    ): String

    open fun formatRange(
        startDate: PlainMonthDay,
        endDate: PlainMonthDay,
    ): String

    open fun formatRange(
        startDate: PlainTime,
        endDate: PlainTime,
    ): String

    open fun formatRange(
        startDate: PlainDateTime,
        endDate: PlainDateTime,
    ): String

    open fun formatRange(
        startDate: Instant,
        endDate: Instant,
    ): String

    open fun formatRangeToParts(
        startDate: PlainDate,
        endDate: PlainDate,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun formatRangeToParts(
        startDate: PlainYearMonth,
        endDate: PlainYearMonth,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun formatRangeToParts(
        startDate: PlainMonthDay,
        endDate: PlainMonthDay,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun formatRangeToParts(
        startDate: PlainTime,
        endDate: PlainTime,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun formatRangeToParts(
        startDate: PlainDateTime,
        endDate: PlainDateTime,
    ): ReadonlyArray<DateTimeRangeFormatPart>

    open fun formatRangeToParts(
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
