// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.messaging.MessagePort

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent#options)
 */
@JsPlainObject
external interface ExtendableMessageEventInit :
    ExtendableEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent#data)
     */
    var data: JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent#lastEventId)
     */
    var lastEventId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent#origin)
     */
    var origin: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent#ports)
     */
    var ports: ReadonlyArray<MessagePort>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent#source)
     */
    var source: JsAny /* Client | ServiceWorker | MessagePort */?
}
