// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontVariantAlternates {
    companion object {
        @JsValue("historical-forms")
        val historicalForms: FontVariantAlternates

        @JsValue("normal")
        val normal: FontVariantAlternates
    }
}
