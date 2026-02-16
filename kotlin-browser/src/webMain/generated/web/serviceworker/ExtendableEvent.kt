// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`ExtendableEvent`** interface extends the lifetime of the install and activate events dispatched on the global scope as part of the service worker lifecycle. This ensures that any functional events (like FetchEvent) are not dispatched until it upgrades database schemas and deletes the outdated cache entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent)
 */
open external class ExtendableEvent(
    override val type: EventType<ExtendableEvent>,
    init: ExtendableEventInit = definedExternally,
) : Event {
    /**
     * The **`ExtendableEvent.waitUntil()`** method tells the event dispatcher that work is ongoing. It can also be used to detect whether that work was successful. In service workers, waitUntil() tells the browser that work is ongoing until the promise settles, and it shouldn't terminate the service worker if it wants that work to complete.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
     */
    fun waitUntil(f: Promise<*>)

    companion object
}

inline val ExtendableEvent.Companion.ACTIVATE: EventType<ExtendableEvent>
    get() = EventType("activate")

inline val ExtendableEvent.Companion.INSTALL: EventType<ExtendableEvent>
    get() = EventType("install")
