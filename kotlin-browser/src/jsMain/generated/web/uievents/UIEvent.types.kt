// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class UIEventTypes {

    @JsValue("abort")
    fun <C : EventTarget> abort(): EventType<UIEvent, C>

    @JsValue("resize")
    fun <C : EventTarget> resize(): EventType<UIEvent, C>
}
