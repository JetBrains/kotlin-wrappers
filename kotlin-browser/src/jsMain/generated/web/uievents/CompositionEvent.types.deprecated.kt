// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventType

sealed external class CompositionEventTypes_deprecated {

    @JsValue("compositionend")
    fun compositionEnd(): EventType<CompositionEvent>

    @JsValue("compositionstart")
    fun compositionStart(): EventType<CompositionEvent>

    @JsValue("compositionupdate")
    fun compositionUpdate(): EventType<CompositionEvent>
}
