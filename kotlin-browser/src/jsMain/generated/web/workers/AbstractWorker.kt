// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.workers

import web.errors.ErrorEvent
import web.events.EventHandler
import web.events.EventTarget

external interface AbstractWorker : EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event) */
    var onerror: EventHandler<ErrorEvent>?
        get() = definedExternally
        set(value) = definedExternally
}
