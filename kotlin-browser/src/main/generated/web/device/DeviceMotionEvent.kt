// Automatically generated - do not modify!

package web.device

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface DeviceMotionEventInit : EventInit {
    var acceleration: DeviceMotionEventAccelerationInit?
    var accelerationIncludingGravity: DeviceMotionEventAccelerationInit?
    var interval: Double?
    var rotationRate: DeviceMotionEventRotationRateInit?
}

open external class DeviceMotionEvent(
    type: EventType<DeviceMotionEvent>,
    init: DeviceMotionEventInit = definedExternally,
) : Event {
    val acceleration: DeviceMotionEventAcceleration?
    val accelerationIncludingGravity: DeviceMotionEventAcceleration?
    val interval: Double
    val rotationRate: DeviceMotionEventRotationRate?

    companion object
}
