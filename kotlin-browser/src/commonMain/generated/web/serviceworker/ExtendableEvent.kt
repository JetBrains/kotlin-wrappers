// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * Extends the lifetime of the install and activate events dispatched on the global scope as part of the service worker lifecycle. This ensures that any functional events (like FetchEvent) are not dispatched until it upgrades database schemas and deletes the outdated cache entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent)
 */
open external class ExtendableEvent(
    override val type: EventType<ExtendableEvent>,
    init: ExtendableEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
     */
    fun waitUntil(f: Promise<*>)

    @JsAlias(THIS)
    override fun asInit(): ExtendableEventInit

    companion object {
        @JsValue("activate")
        val ACTIVATE: EventType<ExtendableEvent>

        @JsValue("install")
        val INSTALL: EventType<ExtendableEvent>
    }
}
