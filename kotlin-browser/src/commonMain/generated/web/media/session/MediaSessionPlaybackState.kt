// Automatically generated - do not modify!

package web.media.session

import seskar.js.JsValue

sealed external interface MediaSessionPlaybackState {
    companion object {
        @JsValue("none")
        val none: MediaSessionPlaybackState

        @JsValue("paused")
        val paused: MediaSessionPlaybackState

        @JsValue("playing")
        val playing: MediaSessionPlaybackState
    }
}
