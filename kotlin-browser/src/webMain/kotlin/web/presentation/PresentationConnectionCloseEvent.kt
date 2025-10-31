package web.presentation

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionCloseEvent)
 */
@ExperimentalWebApi
open external class PresentationConnectionCloseEvent(
    override val type: EventType<PresentationConnectionCloseEvent>,
    init: PresentationConnectionCloseEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionCloseEvent/reason)
     */
    val reason: PresentationConnectionCloseReason

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionCloseEvent/message)
     */
    val message: String

    companion object
}

@ExperimentalWebApi
inline val PresentationConnectionCloseEvent.Companion.CLOSE: EventType<PresentationConnectionCloseEvent>
    get() = EventType("close")
