// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.media.recorder

import seskar.js.JsValue

sealed external interface RecordingState {
    companion object {
        @JsValue("inactive")
        val inactive: RecordingState

        @JsValue("paused")
        val paused: RecordingState

        @JsValue("recording")
        val recording: RecordingState
    }
}
