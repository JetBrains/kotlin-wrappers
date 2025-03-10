// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.audio

import seskar.js.JsValue

sealed external interface AudioContextState {
    companion object {
        @JsValue("closed")
        val closed: AudioContextState

        @JsValue("running")
        val running: AudioContextState

        @JsValue("suspended")
        val suspended: AudioContextState
    }
}
