// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.remoteplayback

import seskar.js.JsValue

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
