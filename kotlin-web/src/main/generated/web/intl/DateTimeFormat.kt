// Automatically generated - do not modify!

package web.intl

import kotlinx.js.ReadonlyArray

sealed external interface DateTimeFormat {
    fun formatToParts(date: Any /* Date | number */ = definedExternally): ReadonlyArray<DateTimeFormatPart>
    fun formatRange(
        startDate: Any, /* Date | number | bigint */
        endDate: Any, /* Date | number | bigint */
    ): String

    fun formatRangeToParts(
        startDate: Any, /* Date | number | bigint */
        endDate: Any, /* Date | number | bigint */
    ): ReadonlyArray<DateTimeRangeFormatPart>
}
