// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`ExtendableEvent`** interface extends the lifetime of the `install` and `activate` events dispatched on the global scope as part of the service worker lifecycle.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent)
 */
open external class ExtendableEvent(
    override val type: EventType<ExtendableEvent>,
    init: ExtendableEventInit = definedExternally,
) : Event {
    /**
     * The **`ExtendableEvent.waitUntil()`** method tells the event dispatcher that work is ongoing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
     */
    fun waitUntil(f: Promise<*>)

    companion object
}

inline fun ExtendableEvent.asInit(): ExtendableEventInit =
    unsafeCast(this)

inline val ExtendableEvent.Companion.ACTIVATE: EventType<ExtendableEvent>
    get() = EventType("activate")

inline val ExtendableEvent.Companion.INSTALL: EventType<ExtendableEvent>
    get() = EventType("install")
