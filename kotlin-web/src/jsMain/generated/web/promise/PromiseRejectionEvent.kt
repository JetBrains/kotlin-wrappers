// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.promise

import js.errors.JsError
import js.promise.Promise
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent)
 */
open external class PromiseRejectionEvent<out C : EventTarget?>(
    override val type: EventType<PromiseRejectionEvent<*>>,
    init: PromiseRejectionEventInit,
) : Event<C>,
    PromiseRejectionEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise)
     */
    override val promise: Promise<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason)
     */
    override val reason: JsError?

    companion object : PromiseRejectionEventTypes
}
