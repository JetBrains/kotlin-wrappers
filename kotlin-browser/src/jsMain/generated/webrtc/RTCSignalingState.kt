// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webrtc

// language=JavaScript
@JsName("""(/*union*/{closed: 'closed', haveLocalOffer: 'have-local-offer', haveLocalPranswer: 'have-local-pranswer', haveRemoteOffer: 'have-remote-offer', haveRemotePranswer: 'have-remote-pranswer', stable: 'stable'}/*union*/)""")
sealed external interface RTCSignalingState {
    companion object {
        val closed: RTCSignalingState
        val haveLocalOffer: RTCSignalingState
        val haveLocalPranswer: RTCSignalingState
        val haveRemoteOffer: RTCSignalingState
        val haveRemotePranswer: RTCSignalingState
        val stable: RTCSignalingState
    }
}
