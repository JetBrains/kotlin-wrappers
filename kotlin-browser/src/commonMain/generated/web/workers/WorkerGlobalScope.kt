// Automatically generated - do not modify!

package web.workers

import js.globals.GlobalScope
import web.csp.SecurityPolicyViolationEvent
import web.errors.ErrorEvent
import web.events.*
import web.fonts.FontFaceSource
import web.promise.PromiseRejectionEvent

/**
 * The **`WorkerGlobalScope`** interface of the Web Workers API is an interface representing the scope of any worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope)
 */
open external class WorkerGlobalScope
private constructor() :
    EventTarget,
    GlobalScope,
    FontFaceSource {
    /**
     * The **`location`** read-only property of the WorkerGlobalScope interface returns the WorkerLocation associated with the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/location)
     */
    val location: WorkerLocation

    /**
     * The **`navigator`** read-only property of the WorkerGlobalScope interface returns the WorkerNavigator associated with the worker.
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
