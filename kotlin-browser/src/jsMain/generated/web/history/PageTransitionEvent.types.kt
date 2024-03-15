// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class PageTransitionEventTypes {

    @JsValue("pagehide")
    fun <C : EventTarget> pageHide(): EventType<PageTransitionEvent, C>

    @JsValue("pageshow")
    fun <C : EventTarget> pageShow(): EventType<PageTransitionEvent, C>
}
