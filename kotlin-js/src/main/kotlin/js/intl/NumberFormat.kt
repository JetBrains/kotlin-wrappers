// Automatically generated - do not modify!

package js.intl

import kotlinx.js.ReadonlyArray

sealed external interface NumberFormat {
    fun formatToParts(number: Number /* | BigInt */ = definedExternally): ReadonlyArray<NumberFormatPart>
    fun formatRange(
        start: Number, /* | BigInt */
        end: Number, /* | BigInt */
    ): String

    fun formatRangeToParts(
        start: Number, /* | BigInt */
        end: Number, /* | BigInt */
    ): ReadonlyArray<NumberRangeFormatPart>
}
