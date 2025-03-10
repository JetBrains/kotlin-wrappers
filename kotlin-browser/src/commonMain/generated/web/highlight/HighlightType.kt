// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
