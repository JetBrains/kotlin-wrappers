// Automatically generated - do not modify!

package web.remoteplayback

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RemotePlaybackState {
    companion object {
        @JsValue("connected")
        val connected: RemotePlaybackState

        @JsValue("connecting")
        val connecting: RemotePlaybackState

        @JsValue("disconnected")
        val disconnected: RemotePlaybackState
    }
}
