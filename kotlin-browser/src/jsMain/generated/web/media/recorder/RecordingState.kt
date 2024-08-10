// Automatically generated - do not modify!

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
