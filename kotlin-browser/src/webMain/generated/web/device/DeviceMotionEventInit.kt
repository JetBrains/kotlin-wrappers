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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/DeviceMotionEvent#acceleration)
     */
    var acceleration: DeviceMotionEventAccelerationInit?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/DeviceMotionEvent#accelerationIncludingGravity)
     */
    var accelerationIncludingGravity: DeviceMotionEventAccelerationInit?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/DeviceMotionEvent#interval)
     */
    var interval: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/DeviceMotionEvent#rotationRate)
     */
    var rotationRate: DeviceMotionEventRotationRateInit?
}
