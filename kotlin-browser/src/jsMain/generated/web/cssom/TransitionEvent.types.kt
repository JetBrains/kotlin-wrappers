// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import web.events.EventType

sealed external class TransitionEventTypes :
    TransitionEventTypes_deprecated {

    @JsValue("transitioncancel")
    val TRANSITION_CANCEL: EventType<TransitionEvent>

    @JsValue("transitionend")
    val TRANSITION_END: EventType<TransitionEvent>

    @JsValue("transitionrun")
    val TRANSITION_RUN: EventType<TransitionEvent>

    @JsValue("transitionstart")
    val TRANSITION_START: EventType<TransitionEvent>
}
