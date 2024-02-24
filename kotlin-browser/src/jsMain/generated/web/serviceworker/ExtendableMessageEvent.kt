// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.array.ReadonlyArray
import web.events.EventTarget
import web.events.EventType
import web.messaging.MessagePort

/**
 * This ServiceWorker API interface represents the event object of a message event fired on a service worker (when a channel message is received on the ServiceWorkerGlobalScope from another context) — extends the lifetime of such events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent)
 */
open external class ExtendableMessageEvent<out C : EventTarget?>(
    override val type: EventType<ExtendableMessageEvent<C>>,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent<C>,
    ExtendableMessageEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/data)
     */
    override val data: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/lastEventId)
     */
    override val lastEventId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/origin)
     */
    override val origin: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ports)
     */
    override val ports: ReadonlyArray<MessagePort>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/source)
     */
    override val source: Any /* Client | ServiceWorker | MessagePort */?

    companion object : ExtendableMessageEventTypes
}
