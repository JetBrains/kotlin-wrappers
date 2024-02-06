// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import web.events.EventInit

external interface MessageEventInit<T> : EventInit {
    var data: T?
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>?
    var source: MessageEventSource?
}
