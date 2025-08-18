package web.presentation

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionAvailableEvent)
 */
open external class PresentationConnectionAvailableEvent(
    override val type: EventType<PresentationConnectionAvailableEvent>,
    init: PresentationConnectionAvailableEventInit = definedExternally,
) : Event {
    /**
     * The **`clipboardData`** property of the PresentationConnectionAvailableEvent interface holds a DataTransfer object, which can be used to:
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionAvailableEvent/clipboardData)
     */
    val connection: PresentationConnection

    companion object
}

inline fun PresentationConnectionAvailableEvent.asInit(): PresentationConnectionAvailableEventInit =
    unsafeCast(this)

inline val PresentationConnectionAvailableEvent.Companion.CONNECTION_AVAILABLE: EventType<PresentationConnectionAvailableEvent>
    get() = EventType("connectionavailable")
