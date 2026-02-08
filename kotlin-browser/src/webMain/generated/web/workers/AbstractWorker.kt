// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.workers

import js.internal.InternalApi
import web.errors.ErrorEvent
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface AbstractWorker :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/error_event)
     */
    var onerror: EventHandler<ErrorEvent, AbstractWorker, AbstractWorker>?
        get() = definedExternally
        set(value) = definedExternally
}
