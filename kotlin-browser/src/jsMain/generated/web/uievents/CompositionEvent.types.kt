// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class CompositionEventTypes {

    @JsValue("compositionend")
    fun <C : EventTarget> compositionEnd(): EventType<CompositionEvent, C>

    @JsValue("compositionstart")
    fun <C : EventTarget> compositionStart(): EventType<CompositionEvent, C>

    @JsValue("compositionupdate")
    fun <C : EventTarget> compositionUpdate(): EventType<CompositionEvent, C>
}
