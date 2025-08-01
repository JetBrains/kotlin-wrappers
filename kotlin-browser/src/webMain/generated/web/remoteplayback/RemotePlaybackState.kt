// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.remoteplayback

import js.reflect.unsafeCast

sealed external interface RemotePlaybackState {
    companion object
}

inline val RemotePlaybackState.Companion.connected: RemotePlaybackState
    get() = unsafeCast("connected")

inline val RemotePlaybackState.Companion.connecting: RemotePlaybackState
    get() = unsafeCast("connecting")

inline val RemotePlaybackState.Companion.disconnected: RemotePlaybackState
    get() = unsafeCast("disconnected")
