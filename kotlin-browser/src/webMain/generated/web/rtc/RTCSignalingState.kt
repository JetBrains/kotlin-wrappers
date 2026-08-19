// Automatically generated - do not modify!

package web.rtc

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState)
 */
@JsUnion
sealed /* union */
external interface RTCSignalingState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState#closed)
 */
inline val RTCSignalingState.Companion.closed: RTCSignalingState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState#have-local-offer)
 */
inline val RTCSignalingState.Companion.haveLocalOffer: RTCSignalingState
    get() = unsafeCast("have-local-offer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState#have-local-pranswer)
 */
inline val RTCSignalingState.Companion.haveLocalPranswer: RTCSignalingState
    get() = unsafeCast("have-local-pranswer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState#have-remote-offer)
 */
inline val RTCSignalingState.Companion.haveRemoteOffer: RTCSignalingState
    get() = unsafeCast("have-remote-offer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState#have-remote-pranswer)
 */
inline val RTCSignalingState.Companion.haveRemotePranswer: RTCSignalingState
    get() = unsafeCast("have-remote-pranswer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnection/signalingState#stable)
 */
inline val RTCSignalingState.Companion.stable: RTCSignalingState
    get() = unsafeCast("stable")
