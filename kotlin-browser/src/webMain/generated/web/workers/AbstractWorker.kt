// Automatically generated - do not modify!

package web.workers

import js.internal.InternalApi
import web.errors.ErrorEvent
import web.events.EventHandler
import web.events.EventTargetLike

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface AbstractWorker :
    EventTargetLike {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event)
     */
    var onerror: EventHandler<ErrorEvent, AbstractWorker, AbstractWorker>?
        get() = definedExternally
        set(value) = definedExternally
}
