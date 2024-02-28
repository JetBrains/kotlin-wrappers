// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.push

import web.events.EventTarget
import web.events.EventType
import web.serviceworker.ExtendableEvent

/**
 * This Push API interface represents a push message that has been received. This event is sent to the global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent)
 */
open external class PushEvent<out C : EventTarget?>(
    override val type: EventType<PushEvent<EventTarget>>,
    init: PushEventInit = definedExternally,
) : ExtendableEvent<C>,
    PushEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent/data)
     */
    override val data: PushMessageData?

    companion object : PushEventTypes
}
