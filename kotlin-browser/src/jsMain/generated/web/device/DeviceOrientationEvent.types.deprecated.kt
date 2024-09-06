// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import web.events.EventType

sealed external class DeviceOrientationEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DeviceOrientationEvent.DEVICE_ORIENTATION"),
    )
    @JsValue("deviceorientation")
    fun deviceOrientation(): EventType<DeviceOrientationEvent>

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DeviceOrientationEvent.DEVICE_ORIENTATION_ABSOLUTE"),
    )
    @JsValue("deviceorientationabsolute")
    fun deviceOrientationAbsolute(): EventType<DeviceOrientationEvent>
}
