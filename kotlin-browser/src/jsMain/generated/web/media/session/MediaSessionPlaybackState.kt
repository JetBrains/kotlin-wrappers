// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.session

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
