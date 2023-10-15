// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.core.ReadonlyArray
import seskar.js.JsValue
import web.events.EventType
import web.messaging.MessagePort

external interface ExtendableMessageEventInit : ExtendableEventInit {
    var data: Any?
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>?
    var source: Any /* Client | ServiceWorker | MessagePort */?
}

/**
 * This ServiceWorker API interface represents the event object of a message event fired on a service worker (when a channel message is received on the ServiceWorkerGlobalScope from another context) — extends the lifetime of such events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent)
 */
open external class ExtendableMessageEvent(
    override val type: EventType<ExtendableMessageEvent>,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/data) */
    val data: Any?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/lastEventId) */
    val lastEventId: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/origin) */
    val origin: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ports) */
    val ports: ReadonlyArray<MessagePort>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/source) */
    val source: Any /* Client | ServiceWorker | MessagePort */?

    companion object {
        @JsValue("message")
        val MESSAGE: EventType<ExtendableMessageEvent>
    }
}
