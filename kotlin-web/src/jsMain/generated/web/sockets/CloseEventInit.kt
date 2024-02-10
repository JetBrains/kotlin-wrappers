// Automatically generated - do not modify!

package web.sockets

import web.events.EventInit

external interface CloseEventInit : EventInit {
    val code: Short?
    val reason: String?
    val wasClean: Boolean?
}
