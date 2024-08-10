// Automatically generated - do not modify!

package web.window

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class BeforeUnloadEventTypes {

    @JsValue("beforeunload")
    fun <C : EventTarget> beforeUnload(): EventType<BeforeUnloadEvent, C>
}
