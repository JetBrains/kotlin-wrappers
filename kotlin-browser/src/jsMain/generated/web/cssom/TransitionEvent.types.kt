// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import web.events.EventType

sealed external interface TransitionEventTypes {
    @JsValue("transitioncancel")
    val TRANSITION_CANCEL: EventType<TransitionEvent<*>>
        get() = definedExternally

    @JsValue("transitionend")
    val TRANSITION_END: EventType<TransitionEvent<*>>
        get() = definedExternally

    @JsValue("transitionrun")
    val TRANSITION_RUN: EventType<TransitionEvent<*>>
        get() = definedExternally

    @JsValue("transitionstart")
    val TRANSITION_START: EventType<TransitionEvent<*>>
        get() = definedExternally
}
