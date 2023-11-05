// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontFamily {
    companion object {
        @JsValue("cursive")
        val cursive: FontFamily

        @JsValue("fantasy")
        val fantasy: FontFamily

        @JsValue("monospace")
        val monospace: FontFamily

        @JsValue("sans-serif")
        val sansSerif: FontFamily

        @JsValue("serif")
        val serif: FontFamily
    }
}
