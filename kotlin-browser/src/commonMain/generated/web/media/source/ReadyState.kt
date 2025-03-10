// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.media.source

import seskar.js.JsValue

sealed external interface ReadyState {
    companion object {
        @JsValue("closed")
        val closed: ReadyState

        @JsValue("ended")
        val ended: ReadyState

        @JsValue("open")
        val open: ReadyState
    }
}
