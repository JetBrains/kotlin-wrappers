// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import web.messaging.MessagePort

external interface ExtendableMessageEventInit : ExtendableEventInit {
    var data: Any?
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>?
    var source: Any /* Client | ServiceWorker | MessagePort */?
}
