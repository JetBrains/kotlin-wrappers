// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface TransitionEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TransitionEvent.transitionCancel()"),
    )
    @JsValue("transitioncancel")
    val TRANSITION_CANCEL: EventType<TransitionEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TransitionEvent.transitionEnd()"),
    )
    @JsValue("transitionend")
    val TRANSITION_END: EventType<TransitionEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TransitionEvent.transitionRun()"),
    )
    @JsValue("transitionrun")
    val TRANSITION_RUN: EventType<TransitionEvent<EventTarget>>
        get() = definedExternally

    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("TransitionEvent.transitionStart()"),
    )
    @JsValue("transitionstart")
    val TRANSITION_START: EventType<TransitionEvent<EventTarget>>
        get() = definedExternally
}
