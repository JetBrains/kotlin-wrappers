// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent)
 */
open external class RTCErrorEvent<out C : EventTarget?>(
    override val type: EventType<RTCErrorEvent<EventTarget>>,
    init: RTCErrorEventInit,
) : Event<C>,
    RTCErrorEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent/error)
     */
    override val error: RTCError

    companion object : RTCErrorEventTypes
}
