// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external class PageTransitionEventTypes {

    @JsValue("pagehide")
    fun pageHide(): EventType<PageTransitionEvent>

    @JsValue("pageshow")
    fun pageShow(): EventType<PageTransitionEvent>
}
