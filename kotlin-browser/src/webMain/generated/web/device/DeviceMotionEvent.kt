// Automatically generated - do not modify!

package web.device

import js.promise.Promise
import js.promise.await
import web.errors.DOMExceptionType.NotAllowedError
import web.errors.JsThrows
import web.events.Event
import web.events.EventType
import web.permissions.PermissionState

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
     * The **`acceleration`** read-only property of the DeviceMotionEvent interface returns the acceleration recorded by the device, in meters per second squared (m/s²). This value does not include the effect of the gravitational force, in contrast to DeviceMotionEvent.accelerationIncludingGravity.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/acceleration)
     */
    open val acceleration: DeviceMotionEventAcceleration?

    /**
     * The **`accelerationIncludingGravity`** read-only property of the DeviceMotionEvent interface returns the amount of acceleration recorded by the device, in meters per second squared (m/s²). Unlike DeviceMotionEvent.acceleration which compensates for the influence of gravity, its value is the sum of the acceleration of the device as induced by the user and an acceleration equal and opposite to that caused by gravity. In other words, it measures the g-force. In practice, this value represents the raw data measured by an accelerometer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/accelerationIncludingGravity)
     */
    open val accelerationIncludingGravity: DeviceMotionEventAcceleration?

    /**
     * The **`interval`** read-only property of the DeviceMotionEvent interface returns the interval, in milliseconds, at which data is obtained from the underlying hardware. You can use this to determine the granularity of motion events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/interval)
     */
    open val interval: Double

    /**
     * The **`rotationRate`** read-only property of the DeviceMotionEvent interface returns the rate at which the device is rotating around each of its axes in degrees per second.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/rotationRate)
     */
    open val rotationRate: DeviceMotionEventRotationRate?

    companion object {
        /**
         * The **`requestPermission()`** static method of the DeviceMotionEvent interface requests the user's permission to access device motion data from the accelerometer and gyroscope sensors. This method requires transient activation, meaning that it must be triggered by a UI event such as a button click.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/requestPermission_static)
         */
        @JsThrows(NotAllowedError::class)
        @JsName("requestPermission")
        fun requestPermissionAsync(): Promise<PermissionState>
    }
}

/**
 * The **`requestPermission()`** static method of the DeviceMotionEvent interface requests the user's permission to access device motion data from the accelerometer and gyroscope sensors. This method requires transient activation, meaning that it must be triggered by a UI event such as a button click.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/requestPermission_static)
 */
@JsThrows(NotAllowedError::class)
suspend inline fun DeviceMotionEvent.Companion.requestPermission(): PermissionState {
    return requestPermissionAsync().await()
}

inline val DeviceMotionEvent.Companion.DEVICE_MOTION: EventType<DeviceMotionEvent>
    get() = EventType("devicemotion")
