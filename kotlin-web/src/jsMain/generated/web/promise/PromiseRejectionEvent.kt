// Automatically generated - do not modify!

package web.promise

import js.errors.JsError
import js.promise.Promise
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent)
 */
open external class PromiseRejectionEvent(
    override val type: EventType<PromiseRejectionEvent>,
    init: PromiseRejectionEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise)
     */
    val promise: Promise<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason)
     */
    val reason: JsError?

    @JsAlias(THIS)
    override fun asInit(): PromiseRejectionEventInit

    companion object {
        @JsValue("rejectionhandled")
        val REJECTION_HANDLED: EventType<PromiseRejectionEvent>

        @JsValue("unhandledrejection")
        val UNHANDLED_REJECTION: EventType<PromiseRejectionEvent>
    }
}
