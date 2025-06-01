// Automatically generated - do not modify!

package web.mediakey

import js.buffer.ArrayBuffer
import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface MediaKeyMessageEventInit :
    EventInit {
    val message: ArrayBuffer
    val messageType: MediaKeyMessageType
}
