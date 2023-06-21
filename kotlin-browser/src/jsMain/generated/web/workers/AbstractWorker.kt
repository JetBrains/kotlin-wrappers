// Automatically generated - do not modify!

package web.workers

import web.errors.ErrorEvent
import web.events.EventHandler
import web.events.IEventTarget

external interface AbstractWorker : IEventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event) */
    var onerror: EventHandler<ErrorEvent>?
        get() = definedExternally
        set(value) = definedExternally
}
