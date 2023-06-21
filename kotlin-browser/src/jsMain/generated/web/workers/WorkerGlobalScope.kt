// Automatically generated - do not modify!

package web.workers

import web.errors.ErrorEvent
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.fonts.FontFaceSource
import web.window.PromiseRejectionEvent

sealed external class WorkerGlobalScope :
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/error_event) */
    var onerror: EventHandler<ErrorEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/languagechange_event) */
    var onlanguagechange: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/offline_event) */
    var onoffline: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/online_event) */
    var ononline: EventHandler<Event>?
    var onrejectionhandled: EventHandler<PromiseRejectionEvent>?
    var onunhandledrejection: EventHandler<PromiseRejectionEvent>?
}
