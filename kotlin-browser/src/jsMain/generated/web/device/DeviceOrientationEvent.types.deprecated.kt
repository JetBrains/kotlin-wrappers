// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import web.events.EventType

sealed external class DeviceOrientationEventTypes_deprecated {

    @JsValue("deviceorientation")
    fun deviceOrientation(): EventType<DeviceOrientationEvent>

    @JsValue("deviceorientationabsolute")
    fun deviceOrientationAbsolute(): EventType<DeviceOrientationEvent>
}
