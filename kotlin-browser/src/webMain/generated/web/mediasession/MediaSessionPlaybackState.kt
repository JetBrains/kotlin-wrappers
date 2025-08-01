// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediasession

import js.reflect.unsafeCast

sealed external interface MediaSessionPlaybackState {
    companion object
}

inline val MediaSessionPlaybackState.Companion.none: MediaSessionPlaybackState
    get() = unsafeCast("none")

inline val MediaSessionPlaybackState.Companion.paused: MediaSessionPlaybackState
    get() = unsafeCast("paused")

inline val MediaSessionPlaybackState.Companion.playing: MediaSessionPlaybackState
    get() = unsafeCast("playing")
