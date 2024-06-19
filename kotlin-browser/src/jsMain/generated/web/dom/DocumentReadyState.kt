// Automatically generated - do not modify!

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
