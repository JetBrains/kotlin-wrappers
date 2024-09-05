// Automatically generated - do not modify!

package web.workers

import web.csp.SecurityPolicyViolationEvent
import web.events.Event
import web.events.EventInstance
import web.promise.PromiseRejectionEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/error_event)
 */
inline val <C : WorkerGlobalScope> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/languagechange_event)
 */
inline val <C : WorkerGlobalScope> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.languageChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/offline_event)
 */
inline val <C : WorkerGlobalScope> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.offline())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/online_event)
 */
inline val <C : WorkerGlobalScope> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.online())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/rejectionhandled_event)
 */
inline val <C : WorkerGlobalScope> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.rejectionHandled())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/securitypolicyviolation_event)
 */
inline val <C : WorkerGlobalScope> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, SecurityPolicyViolationEvent.securityPolicyViolation())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/unhandledrejection_event)
 */
inline val <C : WorkerGlobalScope> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.unhandledRejection())
