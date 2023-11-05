// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextTransform {
    companion object {
        @JsValue("capitalize")
        val capitalize: TextTransform

        @JsValue("full-size-kana")
        val fullSizeKana: TextTransform

        @JsValue("full-width")
        val fullWidth: TextTransform

        @JsValue("lowercase")
        val lowercase: TextTransform

        @JsValue("uppercase")
        val uppercase: TextTransform
    }
}
