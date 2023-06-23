// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import web.events.Event
import web.events.EventInit
import web.events.EventType
import kotlin.js.Promise

/**
 * Extends the lifetime of the install and activate events dispatched on the global scope as part of the service worker lifecycle. This ensures that any functional events (like FetchEvent) are not dispatched until it upgrades database schemas and deletes the outdated cache entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent)
 */
external interface ExtendableEventInit : EventInit

open external class ExtendableEvent(
    override val type: EventType<ExtendableEvent>,
    init: ExtendableEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil) */
    fun waitUntil(f: Promise<*>)

    companion object
}
