// Automatically generated - do not modify!

package web.promise

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class PromiseRejectionEventTypes :
    PromiseRejectionEventTypes_deprecated {

    @JsValue("rejectionhandled")
    fun <C : EventTarget> rejectionHandled(): EventType<PromiseRejectionEvent<C>>

    @JsValue("unhandledrejection")
    fun <C : EventTarget> unhandledRejection(): EventType<PromiseRejectionEvent<C>>
}
