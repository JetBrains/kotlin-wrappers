// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediastreams

import seskar.js.JsValue

sealed external interface MediaStreamTrackState {
    companion object {
        @JsValue("ended")
        val ended: MediaStreamTrackState

        @JsValue("live")
        val live: MediaStreamTrackState
    }
}
