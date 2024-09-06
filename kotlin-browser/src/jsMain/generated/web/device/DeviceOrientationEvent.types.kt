// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import web.events.EventType

sealed external class DeviceOrientationEventTypes :
    DeviceOrientationEventTypes_deprecated {

    @JsValue("deviceorientation")
    val DEVICE_ORIENTATION: EventType<DeviceOrientationEvent>

    @JsValue("deviceorientationabsolute")
    val DEVICE_ORIENTATION_ABSOLUTE: EventType<DeviceOrientationEvent>
}
