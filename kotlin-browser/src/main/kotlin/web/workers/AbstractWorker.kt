package web.workers

import web.errors.ErrorEvent
import web.events.IEventTarget

external interface AbstractWorker : IEventTarget {
    var onerror: ((event: ErrorEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}
