// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external class PageTransitionEventTypes :
    PageTransitionEventTypes_deprecated {

    @JsValue("pagehide")
    val PAGE_HIDE: EventType<PageTransitionEvent>

    @JsValue("pageshow")
    val PAGE_SHOW: EventType<PageTransitionEvent>
}
