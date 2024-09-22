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
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannelEvent)
 */
open external class RTCDataChannelEvent(
    override val type: EventType<RTCDataChannelEvent>,
    init: RTCDataChannelEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannelEvent/channel)
     */
    val channel: RTCDataChannel

    @JsAlias(THIS)
    override fun asInit(): RTCDataChannelEventInit

    companion object {
        @JsValue("datachannel")
        val DATA_CHANNEL: EventType<RTCDataChannelEvent>
    }
}
