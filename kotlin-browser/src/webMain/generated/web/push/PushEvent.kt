// Automatically generated - do not modify!

package web.push

import web.events.EventType
import web.serviceworker.ExtendableEvent
import kotlin.js.definedExternally

/**
 * The **`PushEvent`** interface of the Push API represents a push message that has been received. This event is sent to the global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent)
 */
open external class PushEvent(
    override val type: EventType<PushEvent>,
    init: PushEventInit = definedExternally,
) : ExtendableEvent {
    /**
     * The **`data`** read-only property of the PushEvent interface returns a reference to a PushMessageData object containing data sent to the PushSubscription.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent/data)
     */
    val data: PushMessageData?

    companion object
}

inline val PushEvent.Companion.PUSH: EventType<PushEvent>
    get() = EventType("push")
