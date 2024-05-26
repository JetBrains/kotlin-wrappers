// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.EventTarget
import web.events.EventType
import web.messaging.MessagePort

/**
 * This ServiceWorker API interface represents the event object of a message event fired on a service worker (when a channel message is received on the ServiceWorkerGlobalScope from another context) — extends the lifetime of such events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent)
 */
open external class ExtendableMessageEvent(
    override val type: EventType<ExtendableMessageEvent, EventTarget>,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/data)
     */
    val data: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/lastEventId)
     */
    val lastEventId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/origin)
     */
    val origin: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ports)
     */
    val ports: ReadonlyArray<MessagePort>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/source)
     */
    val source: Any /* Client | ServiceWorker | MessagePort */?

    @JsAlias(THIS)
    override fun asInit(): ExtendableMessageEventInit

    companion object : ExtendableMessageEventTypes
}
