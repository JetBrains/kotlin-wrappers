// Automatically generated - do not modify!

package web.mediastreams

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/readyState)
 */
@JsUnion
sealed /* union */
external interface MediaStreamTrackState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/readyState#ended)
 */
inline val MediaStreamTrackState.Companion.ended: MediaStreamTrackState
    get() = unsafeCast("ended")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/readyState#live)
 */
inline val MediaStreamTrackState.Companion.live: MediaStreamTrackState
    get() = unsafeCast("live")
