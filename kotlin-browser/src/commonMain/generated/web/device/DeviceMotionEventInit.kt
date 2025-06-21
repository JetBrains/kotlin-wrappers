// Automatically generated - do not modify!

package web.device

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface DeviceMotionEventInit :
    EventInit {
    var acceleration: DeviceMotionEventAccelerationInit?
    var accelerationIncludingGravity: DeviceMotionEventAccelerationInit?
    var interval: Double?
    var rotationRate: DeviceMotionEventRotationRateInit?
}
