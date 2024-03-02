// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.history

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface PageTransitionEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PageTransitionEvent.pageHide()"),
    )
    @JsValue("pagehide")
    val PAGE_HIDE: EventType<PageTransitionEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("PageTransitionEvent.pageShow()"),
    )
    @JsValue("pageshow")
    val PAGE_SHOW: EventType<PageTransitionEvent<EventTarget>>
        get() = definedExternally
}