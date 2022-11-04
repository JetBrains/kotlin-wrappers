// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.device

import web.events.Event
import web.events.EventInit

external interface DeviceMotionEventInit : EventInit {
    var acceleration: DeviceMotionEventAccelerationInit?
    var accelerationIncludingGravity: DeviceMotionEventAccelerationInit?
    var interval: Double?
    var rotationRate: DeviceMotionEventRotationRateInit?
}

sealed external class DeviceMotionEvent : Event {
    companion object
}
