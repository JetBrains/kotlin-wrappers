// Automatically generated - do not modify!

package web.promise

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class PromiseRejectionEventTypes {

    @JsValue("rejectionhandled")
    fun <C : EventTarget> rejectionHandled(): EventType<PromiseRejectionEvent, C>

    @JsValue("unhandledrejection")
    fun <C : EventTarget> unhandledRejection(): EventType<PromiseRejectionEvent, C>
}
