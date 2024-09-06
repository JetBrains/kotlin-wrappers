// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import web.events.EventType

sealed external class TransitionEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TransitionEvent.TRANSITION_CANCEL"),
    )
    @JsValue("transitioncancel")
    fun transitionCancel(): EventType<TransitionEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TransitionEvent.TRANSITION_END"),
    )
    @JsValue("transitionend")
    fun transitionEnd(): EventType<TransitionEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TransitionEvent.TRANSITION_RUN"),
    )
    @JsValue("transitionrun")
    fun transitionRun(): EventType<TransitionEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("TransitionEvent.TRANSITION_START"),
    )
    @JsValue("transitionstart")
    fun transitionStart(): EventType<TransitionEvent>
}
