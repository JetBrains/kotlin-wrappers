// Automatically generated - do not modify!

package web.workers

import web.csp.SecurityPolicyViolationEvent
import web.events.Event
import web.events.EventInstance
import web.events.EventType
import web.promise.PromiseRejectionEvent

inline val <C : WorkerGlobalScope> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : WorkerGlobalScope> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("languagechange"))

inline val <C : WorkerGlobalScope> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("offline"))

inline val <C : WorkerGlobalScope> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("online"))

inline val <C : WorkerGlobalScope> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, EventType("rejectionhandled"))

inline val <C : WorkerGlobalScope> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, EventType("securitypolicyviolation"))

inline val <C : WorkerGlobalScope> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, EventType("unhandledrejection"))
