// Automatically generated - do not modify!

package web.sockets

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface CloseEventInit :
    EventInit {
    val code: Short?
    val reason: String?
    val wasClean: Boolean?
}
