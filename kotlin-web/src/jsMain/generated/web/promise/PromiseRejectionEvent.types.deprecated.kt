// Automatically generated - do not modify!

package web.promise

import seskar.js.JsValue
import web.events.EventType

sealed external class PromiseRejectionEventTypes_deprecated {

    @JsValue("rejectionhandled")
    fun rejectionHandled(): EventType<PromiseRejectionEvent>

    @JsValue("unhandledrejection")
    fun unhandledRejection(): EventType<PromiseRejectionEvent>
}
