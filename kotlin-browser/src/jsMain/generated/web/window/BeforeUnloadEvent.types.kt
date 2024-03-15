// Automatically generated - do not modify!

package web.window

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class BeforeUnloadEventTypes {

    @JsValue("beforeunload")
    fun <C : EventTarget> beforeUnload(): EventType<BeforeUnloadEvent, C>
}
