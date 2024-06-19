// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class PopStateEventTypes {

    @JsValue("popstate")
    fun <C : EventTarget> popState(): EventType<PopStateEvent, C>
}
