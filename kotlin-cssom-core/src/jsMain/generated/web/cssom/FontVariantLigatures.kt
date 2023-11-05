// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontVariantLigatures {
    companion object {
        @JsValue("common-ligatures")
        val commonLigatures: FontVariantLigatures

        @JsValue("contextual")
        val contextual: FontVariantLigatures

        @JsValue("discretionary-ligatures")
        val discretionaryLigatures: FontVariantLigatures

        @JsValue("historical-ligatures")
        val historicalLigatures: FontVariantLigatures

        @JsValue("no-common-ligatures")
        val noCommonLigatures: FontVariantLigatures

        @JsValue("no-contextual")
        val noContextual: FontVariantLigatures

        @JsValue("no-discretionary-ligatures")
        val noDiscretionaryLigatures: FontVariantLigatures

        @JsValue("no-historical-ligatures")
        val noHistoricalLigatures: FontVariantLigatures

        @JsValue("normal")
        val normal: FontVariantLigatures
    }
}
