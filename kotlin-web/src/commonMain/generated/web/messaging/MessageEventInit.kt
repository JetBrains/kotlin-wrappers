// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import js.core.JsAny
import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface MessageEventInit<D : JsAny?> :
    EventInit {
    var data: D?
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>?
    var source: MessageEventSource?
}
