// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannelEvent)
 */
open external class RTCDataChannelEvent<out C : EventTarget?>(
    override val type: EventType<RTCDataChannelEvent<EventTarget>>,
    init: RTCDataChannelEventInit,
) : Event<C>,
    RTCDataChannelEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannelEvent/channel)
     */
    override val channel: RTCDataChannel

    companion object : RTCDataChannelEventTypes
}
