// Automatically generated - do not modify!

package web.errors

import web.events.Event
import web.events.EventInit

external interface ErrorEventInit : EventInit {
    var colno: Int?
    var error: Any?
    var filename: String?
    var lineno: Int?
    var message: String?
}

open external class ErrorEvent(
    type: String,
    init: ErrorEventInit = definedExternally,
) : Event {
    val colno: Int
    val error: Any?
    val filename: String
    val lineno: Int
    val message: String

    companion object
}
