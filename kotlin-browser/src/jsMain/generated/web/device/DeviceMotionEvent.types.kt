// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class DeviceMotionEventTypes {

    @JsValue("devicemotion")
    fun <C : EventTarget> deviceMotion(): EventType<DeviceMotionEvent, C>
}
