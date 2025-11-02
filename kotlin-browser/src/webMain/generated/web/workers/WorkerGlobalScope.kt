// Automatically generated - do not modify!

package web.workers

import js.globals.GlobalScope
import web.csp.SecurityPolicyViolationEvent
import web.errors.ErrorEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.fonts.FontFaceSource
import web.promise.PromiseRejectionEvent

/**
 * The **`WorkerGlobalScope`** interface of the Web Workers API is an interface representing the scope of any worker. Workers have no browsing context; this scope contains the information usually conveyed by Window objects — in this case event handlers, the console or the associated WorkerNavigator object. Each WorkerGlobalScope has its own event loop.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope)
 */
open external class WorkerGlobalScope
private constructor() :
    EventTarget,
    GlobalScope,
    FontFaceSource {
    /**
     * The **`location`** read-only property of the WorkerGlobalScope interface returns the WorkerLocation associated with the worker. It is a specific location object, mostly a subset of the Location for browsing scopes, but adapted to workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/location)
     */
    val location: WorkerLocation

    /**
     * The **`navigator`** read-only property of the WorkerGlobalScope interface returns the WorkerNavigator associated with the worker. It is a specific navigator object, mostly a subset of the Navigator for browsing scopes, but adapted to workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/navigator)
     */
    val navigator: WorkerNavigator

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/error_event)
     */
    var onerror: EventHandler<ErrorEvent, WorkerGlobalScope, WorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/languagechange_event)
     */
    var onlanguagechange: EventHandler<Event, WorkerGlobalScope, WorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/offline_event)
     */
    var onoffline: EventHandler<Event, WorkerGlobalScope, WorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/online_event)
     */
    var ononline: EventHandler<Event, WorkerGlobalScope, WorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/rejectionhandled_event)
     */
    var onrejectionhandled: EventHandler<PromiseRejectionEvent, WorkerGlobalScope, WorkerGlobalScope>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/unhandledrejection_event)
     */
    var onunhandledrejection: EventHandler<PromiseRejectionEvent, WorkerGlobalScope, WorkerGlobalScope>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/error_event)
 */
inline val <C : WorkerGlobalScope> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/languagechange_event)
 */
inline val <C : WorkerGlobalScope> C.languageChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "languagechange")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/offline_event)
 */
inline val <C : WorkerGlobalScope> C.offlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "offline")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/online_event)
 */
inline val <C : WorkerGlobalScope> C.onlineEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "online")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/rejectionhandled_event)
 */
inline val <C : WorkerGlobalScope> C.rejectionHandledEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, "rejectionhandled")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/securitypolicyviolation_event)
 */
inline val <C : WorkerGlobalScope> C.securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, C, C>
    get() = EventInstance(this, "securitypolicyviolation")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/unhandledrejection_event)
 */
inline val <C : WorkerGlobalScope> C.unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, C, C>
    get() = EventInstance(this, "unhandledrejection")
