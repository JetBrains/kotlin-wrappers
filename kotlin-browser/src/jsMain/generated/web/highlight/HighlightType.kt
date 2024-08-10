// Automatically generated - do not modify!

package web.highlight

import seskar.js.JsValue

sealed external interface HighlightType {
    companion object {
        @JsValue("grammar-error")
        val grammarError: HighlightType

        @JsValue("highlight")
        val highlight: HighlightType

        @JsValue("spelling-error")
        val spellingError: HighlightType
    }
}
