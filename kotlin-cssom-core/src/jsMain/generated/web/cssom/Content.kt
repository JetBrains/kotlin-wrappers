// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
