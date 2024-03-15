// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class WheelEventTypes {

    @JsValue("wheel")
    fun <C : EventTarget> wheel(): EventType<WheelEvent, C>
}
