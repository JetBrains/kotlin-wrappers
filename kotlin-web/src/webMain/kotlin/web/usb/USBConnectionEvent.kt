package web.usb

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBConnectionEvent)
 */
@ExperimentalWebApi
open external class USBConnectionEvent(
    override val type: EventType<USBConnectionEvent>,
    init: USBConnectionEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBConnectionEvent/device)
     */
    val device: USBDevice

    companion object
}

@ExperimentalWebApi
inline val USBConnectionEvent.Companion.CONNECT: EventType<USBConnectionEvent>
    get() = EventType("connect")

@ExperimentalWebApi
inline val USBConnectionEvent.Companion.DISCONNECT: EventType<USBConnectionEvent>
    get() = EventType("disconnect")
