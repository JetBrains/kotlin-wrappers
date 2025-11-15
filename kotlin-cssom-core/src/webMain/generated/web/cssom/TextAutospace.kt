// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface TextAutospace {
    companion object {
        @JsValue("ideograph-alpha")
        val ideographAlpha: TextAutospace

        @JsValue("ideograph-numeric")
        val ideographNumeric: TextAutospace

        @JsValue("insert")
        val insert: TextAutospace

        @JsValue("no-autospace")
        val noAutospace: TextAutospace

        @JsValue("punctuation")
        val punctuation: TextAutospace

        @JsValue("replace")
        val replace: TextAutospace

        @JsValue("normal")
        val normal: TextAutospace
    }
}
