// Automatically generated - do not modify!

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
