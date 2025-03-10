// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.media.streams

import seskar.js.JsValue

sealed external interface MediaStreamTrackState {
    companion object {
        @JsValue("ended")
        val ended: MediaStreamTrackState

        @JsValue("live")
        val live: MediaStreamTrackState
    }
}
