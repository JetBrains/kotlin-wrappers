// Automatically generated - do not modify!

package dom.events

import org.w3c.dom.PromiseRejectionEvent
import web.events.EventType

inline val PromiseRejectionEvent.Companion.REJECTION_HANDLED: EventType<PromiseRejectionEvent>
    get() = EventType("rejectionhandled")

inline val PromiseRejectionEvent.Companion.UNHANDLED_REJECTION: EventType<PromiseRejectionEvent>
    get() = EventType("unhandledrejection")
