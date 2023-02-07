// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.core.ReadonlyArray
import web.events.EventType
import web.messaging.MessagePort

external interface ExtendableMessageEventInit : ExtendableEventInit {
    var data: Any?
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>?
    var source: Any /* Client | ServiceWorker | MessagePort */?
}

open external class ExtendableMessageEvent(
    override val type: EventType<ExtendableMessageEvent>,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent {
    val data: Any?
    val lastEventId: String
    val origin: String
    val ports: ReadonlyArray<MessagePort>
    val source: Any /* Client | ServiceWorker | MessagePort */?

    companion object
}
