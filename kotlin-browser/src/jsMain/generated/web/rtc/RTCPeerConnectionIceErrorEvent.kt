// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent)
 */
open external class RTCPeerConnectionIceErrorEvent(
    override val type: EventType<RTCPeerConnectionIceErrorEvent>,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/address)
     */
    val address: String?
    val errorCode: Short
    val errorText: String
    val port: Short?
    val url: String

    @JsAlias(THIS)
    override fun asInit(): RTCPeerConnectionIceErrorEventInit

    companion object {
        @JsValue("icecandidateerror")
        val ICE_CANDIDATE_ERROR: EventType<RTCPeerConnectionIceErrorEvent>
    }
}
