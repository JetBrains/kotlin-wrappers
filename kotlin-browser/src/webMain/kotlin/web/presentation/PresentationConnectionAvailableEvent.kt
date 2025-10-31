package web.presentation

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionAvailableEvent)
 */
@ExperimentalWebApi
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

@ExperimentalWebApi
inline val PresentationConnectionAvailableEvent.Companion.CONNECTION_AVAILABLE: EventType<PresentationConnectionAvailableEvent>
    get() = EventType("connectionavailable")
