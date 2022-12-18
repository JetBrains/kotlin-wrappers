// Automatically generated - do not modify!

package serviceworkers

import js.core.ReadonlyArray
import web.messaging.MessagePort

external interface ExtendableMessageEventInit : ExtendableEventInit {
    var data: Any?
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>?
    var source: Any /* Client | ServiceWorker | MessagePort */?
}

open external class ExtendableMessageEvent(
    type: String,
    init: ExtendableMessageEventInit = definedExternally,
) : ExtendableEvent {
    val data: Any?
    val lastEventId: String
    val origin: String
    val ports: ReadonlyArray<MessagePort>
    val source: Any /* Client | ServiceWorker | MessagePort */?

    companion object
}
