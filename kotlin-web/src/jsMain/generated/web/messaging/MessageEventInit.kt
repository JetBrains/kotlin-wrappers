// Automatically generated - do not modify!

package web.messaging

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject_KT_68943
import web.events.EventInit

@JsPlainObject_KT_68943
external interface MessageEventInit<out D> :
    EventInit {
    val data: D?
    val lastEventId: String?
    val origin: String?
    val ports: ReadonlyArray<MessagePort>?
    val source: MessageEventSource?
}
