// Automatically generated - do not modify!

package web.promise

import js.errors.JsErrorLike
import js.promise.Promise
import web.events.Event
import web.events.EventType

/**
 * The **`PromiseRejectionEvent`** interface represents events which are sent to the global script context when JavaScript Promises are rejected. These events are particularly useful for telemetry and debugging purposes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent)
 */
open external class PromiseRejectionEvent(
    override val type: EventType<PromiseRejectionEvent>,
    init: PromiseRejectionEventInit,
) : Event {
    /**
     * The PromiseRejectionEvent interface's **`promise`** read-only property indicates the JavaScript Promise which was rejected. You can examine the event's PromiseRejectionEvent.reason property to learn why the promise was rejected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise)
     */
    val promise: Promise<*>

    /**
     * The PromiseRejectionEvent **`reason`** read-only property is any JavaScript value or Object which provides the reason passed into Promise.reject(). This in theory provides information about why the promise was rejected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason)
     */
    val reason: JsErrorLike?

    companion object
}

inline val PromiseRejectionEvent.Companion.REJECTION_HANDLED: EventType<PromiseRejectionEvent>
    get() = EventType("rejectionhandled")

inline val PromiseRejectionEvent.Companion.UNHANDLED_REJECTION: EventType<PromiseRejectionEvent>
    get() = EventType("unhandledrejection")
