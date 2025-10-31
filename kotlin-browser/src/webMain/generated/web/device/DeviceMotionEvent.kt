// Automatically generated - do not modify!

package web.device

import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`DeviceMotionEvent`** interface of the Device Orientation Events provides web developers with information about the speed of changes for the device's position and orientation.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent)
 */
open external class DeviceMotionEvent(
    override val type: EventType<DeviceMotionEvent>,
    init: DeviceMotionEventInit = definedExternally,
) : Event {
    /**
     * The **`acceleration`** read-only property of the DeviceMotionEvent interface returns the acceleration recorded by the device, in meters per second squared (m/s²).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/acceleration)
     */
    val acceleration: DeviceMotionEventAcceleration?

    /**
     * The **`accelerationIncludingGravity`** read-only property of the DeviceMotionEvent interface returns the amount of acceleration recorded by the device, in meters per second squared (m/s²).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/accelerationIncludingGravity)
     */
    val accelerationIncludingGravity: DeviceMotionEventAcceleration?

    /**
     * The **`interval`** read-only property of the DeviceMotionEvent interface returns the interval, in milliseconds, at which data is obtained from the underlying hardware.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/interval)
     */
    val interval: Double

    /**
     * The **`rotationRate`** read-only property of the DeviceMotionEvent interface returns the rate at which the device is rotating around each of its axes in degrees per second.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/rotationRate)
     */
    val rotationRate: DeviceMotionEventRotationRate?

    companion object
}

inline val DeviceMotionEvent.Companion.DEVICE_MOTION: EventType<DeviceMotionEvent>
    get() = EventType("devicemotion")
