package web.presentation

import js.array.ReadonlyArray
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionList)
 */
open external class PresentationConnectionList
private constructor() :
    EventTarget {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionList/connections)
     */
    val connections: ReadonlyArray<PresentationConnection>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionList/onconnectionavailable)
     */
    var onconnectionavailable: EventHandler<PresentationConnectionAvailableEvent, PresentationConnectionList, PresentationConnectionList>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionList/connectionavailable_event)
 */
inline val <C : PresentationConnectionList> C.connectionAvailableEvent: EventInstance<PresentationConnectionAvailableEvent, C, C>
    get() = EventInstance(this, "connectionavailable")
