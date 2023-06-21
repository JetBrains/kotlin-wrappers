// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import web.events.Event
import web.events.EventInit
import web.events.EventType
import kotlin.js.Promise

external interface ExtendableEventInit : EventInit

open external class ExtendableEvent(
    override val type: EventType<ExtendableEvent>,
    init: ExtendableEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil) */
    fun waitUntil(f: Promise<*>)

    companion object
}
