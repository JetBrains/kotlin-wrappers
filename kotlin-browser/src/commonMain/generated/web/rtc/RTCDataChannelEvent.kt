// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * The **`RTCDataChannelEvent`** interface represents an event related to a specific RTCDataChannel.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannelEvent)
 */
open external class RTCDataChannelEvent(
    override val type: EventType<RTCDataChannelEvent>,
    init: RTCDataChannelEventInit,
) : Event {
    /**
     * The read-only property **`RTCDataChannelEvent.channel`** returns the RTCDataChannel associated with the event.
     *
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
