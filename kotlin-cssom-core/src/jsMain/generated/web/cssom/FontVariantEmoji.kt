// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontVariantEmoji {
    companion object {
        @JsValue("emoji")
        val emoji: FontVariantEmoji

        @JsValue("normal")
        val normal: FontVariantEmoji

        @JsValue("text")
        val text: FontVariantEmoji

        @JsValue("unicode")
        val unicode: FontVariantEmoji
    }
}
