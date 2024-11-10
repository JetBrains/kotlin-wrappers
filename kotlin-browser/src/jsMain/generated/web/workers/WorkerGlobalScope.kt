// Automatically generated - do not modify!

package web.workers

import web.csp.SecurityPolicyViolationEvent
import web.errors.ErrorEvent
import web.events.*
import web.fonts.FontFaceSource
import web.promise.PromiseRejectionEvent

/**
 * This Web Workers API interface is an interface representing the scope of any worker. Workers have no browsing context; this scope contains the information usually conveyed by Window objects — in this case event handlers, the console or the associated WorkerNavigator object. Each WorkerGlobalScope has its own event loop.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope)
 */
open external class WorkerGlobalScope
private constructor() :
    EventTarget,
    FontFaceSource {
    /**
     * Returns workerGlobal's WorkerLocation object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/location)
     */
    val location: WorkerLocation

    /**
     * Returns workerGlobal's WorkerNavigator object.
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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<Event, WorkerGlobalScope /* this */, WorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/languagechange_event)
     */
    @JsEvent("languagechange")
    val languageChangeEvent: EventInstance<Event, WorkerGlobalScope /* this */, WorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/offline_event)
     */
    @JsEvent("offline")
    val offlineEvent: EventInstance<Event, WorkerGlobalScope /* this */, WorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/online_event)
     */
    @JsEvent("online")
    val onlineEvent: EventInstance<Event, WorkerGlobalScope /* this */, WorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/rejectionhandled_event)
     */
    @JsEvent("rejectionhandled")
    val rejectionHandledEvent: EventInstance<PromiseRejectionEvent, WorkerGlobalScope /* this */, WorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/securitypolicyviolation_event)
     */
    @JsEvent("securitypolicyviolation")
    val securityPolicyViolationEvent: EventInstance<SecurityPolicyViolationEvent, WorkerGlobalScope /* this */, WorkerGlobalScope /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/unhandledrejection_event)
     */
    @JsEvent("unhandledrejection")
    val unhandledRejectionEvent: EventInstance<PromiseRejectionEvent, WorkerGlobalScope /* this */, WorkerGlobalScope /* this */>
}
