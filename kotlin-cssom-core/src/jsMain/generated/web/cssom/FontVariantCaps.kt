// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontVariantCaps {
    companion object {
        @JsValue("all-petite-caps")
        val allPetiteCaps: FontVariantCaps

        @JsValue("all-small-caps")
        val allSmallCaps: FontVariantCaps

        @JsValue("normal")
        val normal: FontVariantCaps

        @JsValue("petite-caps")
        val petiteCaps: FontVariantCaps

        @JsValue("small-caps")
        val smallCaps: FontVariantCaps

        @JsValue("titling-caps")
        val titlingCaps: FontVariantCaps

        @JsValue("unicase")
        val unicase: FontVariantCaps
    }
}
