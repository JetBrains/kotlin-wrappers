// Automatically generated - do not modify!

package web.promise

import js.errors.JsErrorLike
import js.promise.Promise
import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType

/**
 * The **`PromiseRejectionEvent`** interface represents events which are sent to the global script context when JavaScript Promises are rejected.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent)
 */
open external class PromiseRejectionEvent(
    override val type: EventType<PromiseRejectionEvent>,
    init: PromiseRejectionEventInit,
) : Event {
    /**
     * The PromiseRejectionEvent interface's **`promise`** read-only property indicates the JavaScript rejected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise)
     */
    val promise: Promise<*>

    /**
     * The PromiseRejectionEvent **`reason`** read-only property is any JavaScript value or Object which provides the reason passed into Promise.reject().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason)
     */
    val reason: JsErrorLike?

    companion object
}

inline fun PromiseRejectionEvent.asInit(): PromiseRejectionEventInit =
    unsafeCast(this)

inline val PromiseRejectionEvent.Companion.REJECTION_HANDLED: EventType<PromiseRejectionEvent>
    get() = EventType("rejectionhandled")

inline val PromiseRejectionEvent.Companion.UNHANDLED_REJECTION: EventType<PromiseRejectionEvent>
    get() = EventType("unhandledrejection")
