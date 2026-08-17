// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RTCSignalingState

inline val RTCSignalingState.Companion.closed: RTCSignalingState
    get() = unsafeCast("closed")

inline val RTCSignalingState.Companion.haveLocalOffer: RTCSignalingState
    get() = unsafeCast("have-local-offer")

inline val RTCSignalingState.Companion.haveLocalPranswer: RTCSignalingState
    get() = unsafeCast("have-local-pranswer")

inline val RTCSignalingState.Companion.haveRemoteOffer: RTCSignalingState
    get() = unsafeCast("have-remote-offer")

inline val RTCSignalingState.Companion.haveRemotePranswer: RTCSignalingState
    get() = unsafeCast("have-remote-pranswer")

inline val RTCSignalingState.Companion.stable: RTCSignalingState
    get() = unsafeCast("stable")
