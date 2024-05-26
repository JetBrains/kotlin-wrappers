// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent)
 */
open external class RTCErrorEvent(
    override val type: EventType<RTCErrorEvent, EventTarget>,
    init: RTCErrorEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent/error)
     */
    val error: RTCError

    @JsAlias(THIS)
    override fun asInit(): RTCErrorEventInit

    companion object : RTCErrorEventTypes
}
