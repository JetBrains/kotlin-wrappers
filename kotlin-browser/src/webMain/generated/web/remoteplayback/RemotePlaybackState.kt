// Automatically generated - do not modify!

package web.remoteplayback

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state)
 */
@JsUnion
sealed /* union */
external interface RemotePlaybackState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state#connected)
 */
inline val RemotePlaybackState.Companion.connected: RemotePlaybackState
    get() = unsafeCast("connected")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state#connecting)
 */
inline val RemotePlaybackState.Companion.connecting: RemotePlaybackState
    get() = unsafeCast("connecting")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/state#disconnected)
 */
inline val RemotePlaybackState.Companion.disconnected: RemotePlaybackState
    get() = unsafeCast("disconnected")
