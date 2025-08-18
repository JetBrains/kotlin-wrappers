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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionAvailableEvent/connection)
     */
    val connection: PresentationConnection

    companion object
}

inline fun PresentationConnectionAvailableEvent.asInit(): PresentationConnectionAvailableEventInit =
    unsafeCast(this)

inline val PresentationConnectionAvailableEvent.Companion.CONNECTION_AVAILABLE: EventType<PresentationConnectionAvailableEvent>
    get() = EventType("connectionavailable")
