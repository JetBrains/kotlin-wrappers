// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class PageTransitionEventTypes {

    @JsValue("pagehide")
    fun <C : EventTarget> pageHide(): EventType<PageTransitionEvent, C>

    @JsValue("pageshow")
    fun <C : EventTarget> pageShow(): EventType<PageTransitionEvent, C>
}
