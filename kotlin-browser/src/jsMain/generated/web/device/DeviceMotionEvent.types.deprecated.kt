// Automatically generated - do not modify!

package web.device

import seskar.js.JsValue
import web.events.EventType

sealed external class DeviceMotionEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("DeviceMotionEvent.DEVICE_MOTION"),
    )
    @JsValue("devicemotion")
    fun deviceMotion(): EventType<DeviceMotionEvent>
}
