// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class WheelEventTypes {

    @JsValue("wheel")
    fun <C : EventTarget> wheel(): EventType<WheelEvent, C>
}
