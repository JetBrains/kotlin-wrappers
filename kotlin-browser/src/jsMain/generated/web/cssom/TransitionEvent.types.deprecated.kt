// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import web.events.EventType

sealed external class TransitionEventTypes {

    @JsValue("transitioncancel")
    fun transitionCancel(): EventType<TransitionEvent>

    @JsValue("transitionend")
    fun transitionEnd(): EventType<TransitionEvent>

    @JsValue("transitionrun")
    fun transitionRun(): EventType<TransitionEvent>

    @JsValue("transitionstart")
    fun transitionStart(): EventType<TransitionEvent>
}
