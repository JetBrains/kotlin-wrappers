// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class DeviceOrientationEventTypes {

    @JsValue("deviceorientation")
    fun <C : EventTarget> deviceOrientation(): EventType<DeviceOrientationEvent, C>

    @JsValue("deviceorientationabsolute")
    fun <C : EventTarget> deviceOrientationAbsolute(): EventType<DeviceOrientationEvent, C>
}
