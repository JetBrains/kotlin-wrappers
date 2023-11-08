// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.recorder

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
