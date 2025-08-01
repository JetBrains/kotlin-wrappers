// Automatically generated - do not modify!

package web.mediakey

import js.buffer.ArrayBuffer
import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/MediaKeyMessageEvent/MediaKeyMessageEvent#options)
 */
@JsPlainObject
external interface MediaKeyMessageEventInit :
    EventInit {
    var message: ArrayBuffer
    var messageType: MediaKeyMessageType
}
