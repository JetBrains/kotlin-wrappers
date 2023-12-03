// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.history

import seskar.js.JsValue
import web.events.EventType

sealed external interface PageTransitionEventTypes {
    @JsValue("pagehide")
    val PAGE_HIDE: EventType<PageTransitionEvent>
        get() = definedExternally

    @JsValue("pageshow")
    val PAGE_SHOW: EventType<PageTransitionEvent>
        get() = definedExternally
}
