// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class DeviceOrientationEventTypes {

    @JsValue("deviceorientation")
    fun <C : EventTarget> deviceOrientation(): EventType<DeviceOrientationEvent<C>>

    @JsValue("deviceorientationabsolute")
    fun <C : EventTarget> deviceOrientationAbsolute(): EventType<DeviceOrientationEvent<C>>
}
