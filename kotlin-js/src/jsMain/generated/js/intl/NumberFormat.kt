// Automatically generated - do not modify!

package js.intl

import js.core.BigInt
import js.core.ReadonlyArray

sealed external interface NumberFormat {
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
