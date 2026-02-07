// Automatically generated - do not modify!

package web.device

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/DeviceMotionEvent#options)
 */
@JsPlainObject
external interface DeviceMotionEventInit :
    EventInit {
    var acceleration: DeviceMotionEventAccelerationInit?
    var accelerationIncludingGravity: DeviceMotionEventAccelerationInit?
    var interval: Double?
    var rotationRate: DeviceMotionEventRotationRateInit?
}
