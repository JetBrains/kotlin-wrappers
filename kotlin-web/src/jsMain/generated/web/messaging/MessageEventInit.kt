// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import web.events.EventInit

external interface MessageEventInit<T> : EventInit {
    val data: T?
    val lastEventId: String?
    val origin: String?
    val ports: ReadonlyArray<MessagePort>?
    val source: MessageEventSource?
}
