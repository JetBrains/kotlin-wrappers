// Automatically generated - do not modify!

package web.workers

import web.csp.SecurityPolicyViolationEvent
import web.events.Event
import web.events.EventInstance
import web.promise.PromiseRejectionEvent

inline val <C : WorkerGlobalScope> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

inline val <C : WorkerGlobalScope> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.languageChange())

inline val <C : WorkerGlobalScope> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.offline())

inline val <C : WorkerGlobalScope> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.online())

inline val <C : WorkerGlobalScope> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.rejectionHandled())

inline val <C : WorkerGlobalScope> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, SecurityPolicyViolationEvent.securityPolicyViolation())

inline val <C : WorkerGlobalScope> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.unhandledRejection())
