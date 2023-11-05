// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontVariantNumeric {
    companion object {
        @JsValue("diagonal-fractions")
        val diagonalFractions: FontVariantNumeric

        @JsValue("lining-nums")
        val liningNums: FontVariantNumeric

        @JsValue("normal")
        val normal: FontVariantNumeric

        @JsValue("oldstyle-nums")
        val oldstyleNums: FontVariantNumeric

        @JsValue("ordinal")
        val ordinal: FontVariantNumeric

        @JsValue("proportional-nums")
        val proportionalNums: FontVariantNumeric

        @JsValue("slashed-zero")
        val slashedZero: FontVariantNumeric

        @JsValue("stacked-fractions")
        val stackedFractions: FontVariantNumeric

        @JsValue("tabular-nums")
        val tabularNums: FontVariantNumeric
    }
}
