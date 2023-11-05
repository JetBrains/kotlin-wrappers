// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Content {
    companion object {
        @JsValue("close-quote")
        val closeQuote: Content

        @JsValue("no-close-quote")
        val noCloseQuote: Content

        @JsValue("no-open-quote")
        val noOpenQuote: Content

        @JsValue("open-quote")
        val openQuote: Content

        @JsValue("contents")
        val contents: Content

        @JsValue("normal")
        val normal: Content
    }
}
