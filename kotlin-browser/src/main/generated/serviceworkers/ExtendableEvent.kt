// Automatically generated - do not modify!

package serviceworkers

import web.events.Event
import web.events.EventInit
import web.events.EventType
import kotlin.js.Promise

external interface ExtendableEventInit : EventInit

open external class ExtendableEvent(
    type: EventType<ExtendableEvent>,
    init: ExtendableEventInit = definedExternally,
) : Event {
    fun waitUntil(f: Promise<*>)

    companion object
}
