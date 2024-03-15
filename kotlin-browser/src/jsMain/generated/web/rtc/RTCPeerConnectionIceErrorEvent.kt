// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent)
 */
open external class RTCPeerConnectionIceErrorEvent(
    override val type: EventType<RTCPeerConnectionIceErrorEvent, EventTarget>,
    init: RTCPeerConnectionIceErrorEventInit,
) : Event,
    RTCPeerConnectionIceErrorEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/address)
     */
    override val address: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/errorCode)
     */
    override val errorCode: Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/errorText)
     */
    override val errorText: String
    override val port: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceErrorEvent/url)
     */
    override val url: String

    companion object : RTCPeerConnectionIceErrorEventTypes
}
