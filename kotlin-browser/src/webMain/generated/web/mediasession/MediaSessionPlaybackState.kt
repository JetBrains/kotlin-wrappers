// Automatically generated - do not modify!

package web.mediasession

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaSessionPlaybackState

inline val MediaSessionPlaybackState.Companion.none: MediaSessionPlaybackState
    get() = unsafeCast("none")

inline val MediaSessionPlaybackState.Companion.paused: MediaSessionPlaybackState
    get() = unsafeCast("paused")

inline val MediaSessionPlaybackState.Companion.playing: MediaSessionPlaybackState
    get() = unsafeCast("playing")
