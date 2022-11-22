// Automatically generated - do not modify!

package web.workers

import web.errors.ErrorEvent
import web.events.EventHandler
import web.events.IEventTarget

sealed external interface AbstractWorker : IEventTarget {
    var onerror: EventHandler<ErrorEvent>?
        get() = definedExternally
        set(value) = definedExternally
}
