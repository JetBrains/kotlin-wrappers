// Automatically generated - do not modify!

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external class PageTransitionEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PageTransitionEvent.PAGE_HIDE"),
    )
    @JsValue("pagehide")
    fun pageHide(): EventType<PageTransitionEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("PageTransitionEvent.PAGE_SHOW"),
    )
    @JsValue("pageshow")
    fun pageShow(): EventType<PageTransitionEvent>
}
