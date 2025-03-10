// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.core.JsAny
import js.objects.JsPlainObject
import web.messaging.MessagePort

@JsPlainObject
external interface ExtendableMessageEventInit :
    ExtendableEventInit {
    val data: JsAny?
    val lastEventId: String?
    val origin: String?
    val ports: ReadonlyArray<MessagePort>?
    val source: JsAny /* Client | ServiceWorker | MessagePort */?
}
