// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.promise.Promise
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Extends the lifetime of the install and activate events dispatched on the global scope as part of the service worker lifecycle. This ensures that any functional events (like FetchEvent) are not dispatched until it upgrades database schemas and deletes the outdated cache entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent)
 */
open external class ExtendableEvent<out C : EventTarget?>(
    override val type: EventType<ExtendableEvent<EventTarget>>,
    init: ExtendableEventInit = definedExternally,
) : Event<C>,
    ExtendableEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
     */
    fun waitUntil(f: Promise<*>)

    companion object : ExtendableEventTypes
}
