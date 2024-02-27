// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external interface UIEventTypes {
    @JsValue("abort")
    val ABORT: EventType<UIEvent<*>>
        get() = definedExternally

    @JsValue("resize")
    val RESIZE: EventType<UIEvent<*>>
        get() = definedExternally
}
