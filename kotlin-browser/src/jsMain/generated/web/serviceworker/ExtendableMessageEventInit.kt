// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import web.messaging.MessagePort

external interface ExtendableMessageEventInit :
    ExtendableEventInit {
    val data: Any?
    val lastEventId: String?
    val origin: String?
    val ports: ReadonlyArray<MessagePort>?
    val source: Any /* Client | ServiceWorker | MessagePort */?
}
