// Automatically generated - do not modify!

package web.mediasession

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/playbackState)
 */
@JsUnion
sealed /* union */
external interface MediaSessionPlaybackState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/playbackState#none)
 */
inline val MediaSessionPlaybackState.Companion.none: MediaSessionPlaybackState
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/playbackState#paused)
 */
inline val MediaSessionPlaybackState.Companion.paused: MediaSessionPlaybackState
    get() = unsafeCast("paused")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSession/playbackState#playing)
 */
inline val MediaSessionPlaybackState.Companion.playing: MediaSessionPlaybackState
    get() = unsafeCast("playing")
