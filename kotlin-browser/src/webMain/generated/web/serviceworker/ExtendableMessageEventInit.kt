// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.messaging.MessagePort
import kotlin.js.JsAny

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent#options)
 */
@JsPlainObject
external interface ExtendableMessageEventInit :
    ExtendableEventInit {
    var data: JsAny?
    var lastEventId: String?
    var origin: String?
    var ports: ReadonlyArray<MessagePort>?
    var source: JsAny /* Client | ServiceWorker | MessagePort */?
}
