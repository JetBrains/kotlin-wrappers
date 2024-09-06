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
    get() = EventInstance(this, Event.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/languagechange_event)
 */
inline val <C : WorkerGlobalScope> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.LANGUAGE_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/offline_event)
 */
inline val <C : WorkerGlobalScope> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.OFFLINE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/online_event)
 */
inline val <C : WorkerGlobalScope> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ONLINE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/rejectionhandled_event)
 */
inline val <C : WorkerGlobalScope> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.REJECTION_HANDLED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/securitypolicyviolation_event)
 */
inline val <C : WorkerGlobalScope> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, SecurityPolicyViolationEvent.SECURITY_POLICY_VIOLATION)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/unhandledrejection_event)
 */
inline val <C : WorkerGlobalScope> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, PromiseRejectionEvent.UNHANDLED_REJECTION)
