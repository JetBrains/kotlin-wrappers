// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface MessageEventInit<out T> :
    EventInit {
    val data: T?
    val lastEventId: String?
    val origin: String?
    val ports: ReadonlyArray<MessagePort>?
    val source: MessageEventSource?
}
