// Automatically generated - do not modify!

package web.remoteplayback

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RemotePlaybackState

inline val RemotePlaybackState.Companion.connected: RemotePlaybackState
    get() = unsafeCast("connected")

inline val RemotePlaybackState.Companion.connecting: RemotePlaybackState
    get() = unsafeCast("connecting")

inline val RemotePlaybackState.Companion.disconnected: RemotePlaybackState
    get() = unsafeCast("disconnected")
