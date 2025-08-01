// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediastreams

import js.reflect.unsafeCast

sealed external interface MediaStreamTrackState {
    companion object
}

inline val MediaStreamTrackState.Companion.ended: MediaStreamTrackState
    get() = unsafeCast("ended")

inline val MediaStreamTrackState.Companion.live: MediaStreamTrackState
    get() = unsafeCast("live")
