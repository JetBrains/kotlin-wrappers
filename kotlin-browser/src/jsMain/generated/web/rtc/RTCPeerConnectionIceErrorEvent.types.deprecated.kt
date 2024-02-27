// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external interface RTCPeerConnectionIceErrorEventTypes_deprecated {
    @JsValue("icecandidateerror")
    val ICE_CANDIDATE_ERROR: EventType<RTCPeerConnectionIceErrorEvent<*>>
        get() = definedExternally
}
