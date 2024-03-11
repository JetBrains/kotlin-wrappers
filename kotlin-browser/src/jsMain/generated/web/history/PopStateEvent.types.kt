// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class PopStateEventTypes {

    @JsValue("popstate")
    fun <C : EventTarget> popState(): EventType<PopStateEvent<C>>
}
