// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class DeviceMotionEventTypes {

    @JsValue("devicemotion")
    fun <C : EventTarget> deviceMotion(): EventType<DeviceMotionEvent<C>>
}
