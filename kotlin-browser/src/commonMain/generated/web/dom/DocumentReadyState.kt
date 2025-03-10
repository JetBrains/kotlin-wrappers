// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.dom

import seskar.js.JsValue

sealed external interface DocumentReadyState {
    companion object {
        @JsValue("complete")
        val complete: DocumentReadyState

        @JsValue("interactive")
        val interactive: DocumentReadyState

        @JsValue("loading")
        val loading: DocumentReadyState
    }
}
