// Automatically generated - do not modify!

package web.mediastreams

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaStreamTrackState

inline val MediaStreamTrackState.Companion.ended: MediaStreamTrackState
    get() = unsafeCast("ended")

inline val MediaStreamTrackState.Companion.live: MediaStreamTrackState
    get() = unsafeCast("live")
