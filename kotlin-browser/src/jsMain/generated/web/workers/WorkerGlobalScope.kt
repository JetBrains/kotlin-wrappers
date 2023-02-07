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
    /** Returns workerGlobal's WorkerLocation object. */
    val location: WorkerLocation

    /** Returns workerGlobal's WorkerNavigator object. */
    val navigator: WorkerNavigator
    var onerror: EventHandler<ErrorEvent>?
    var onlanguagechange: EventHandler<Event>?
    var onoffline: EventHandler<Event>?
    var ononline: EventHandler<Event>?
    var onrejectionhandled: EventHandler<PromiseRejectionEvent>?
    var onunhandledrejection: EventHandler<PromiseRejectionEvent>?
}
