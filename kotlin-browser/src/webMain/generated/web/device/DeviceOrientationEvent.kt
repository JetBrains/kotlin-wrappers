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
 * The **`DeviceOrientationEvent`** interface of the Device Orientation Events provides web developers with information from the physical orientation of the device running the web page.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent)
 */
open external class DeviceOrientationEvent(
    override val type: EventType<DeviceOrientationEvent>,
    init: DeviceOrientationEventInit = definedExternally,
) : Event {
    /**
     * The **`absolute`** read-only property of the DeviceOrientationEvent interface indicates whether or not the device is providing orientation data absolutely (that is, in reference to the Earth's coordinate frame) or using some arbitrary frame determined by the device. See Orientation and motion data explained for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/absolute)
     */
    open val absolute: Boolean

    /**
     * The **`alpha`** read-only property of the DeviceOrientationEvent interface returns the rotation of the device around the Z axis; that is, the number of degrees by which the device is being twisted around the center of the screen. See Orientation and motion data explained for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/alpha)
     */
    open val alpha: Double?

    /**
     * The **`beta`** read-only property of the DeviceOrientationEvent interface returns the rotation of the device around the X axis; that is, the number of degrees, ranged between -180 and 180, by which the device is tipped forward or backward. See Orientation and motion data explained for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/beta)
     */
    open val beta: Double?

    /**
     * The **`gamma`** read-only property of the DeviceOrientationEvent interface returns the rotation of the device around the Y axis; that is, the number of degrees, ranged between -90 and 90, by which the device is tilted left or right. See Orientation and motion data explained for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/gamma)
     */
    open val gamma: Double?

    companion object {
        /**
         * The **`requestPermission()`** static method of the DeviceOrientationEvent interface requests the user's permission to access device orientation data from the accelerometer and gyroscope sensors. It can also request permission to access magnetometer data when absolute orientation is needed. This method requires transient activation, meaning that it must be triggered by a UI event such as a button click.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/requestPermission_static)
         */
        @JsThrows(NotAllowedError::class)
        @JsName("requestPermission")
        fun requestPermissionAsync(): Promise<PermissionState>
    }
}

/**
 * The **`requestPermission()`** static method of the DeviceOrientationEvent interface requests the user's permission to access device orientation data from the accelerometer and gyroscope sensors. It can also request permission to access magnetometer data when absolute orientation is needed. This method requires transient activation, meaning that it must be triggered by a UI event such as a button click.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/requestPermission_static)
 */
@JsThrows(NotAllowedError::class)
suspend inline fun DeviceOrientationEvent.Companion.requestPermission(): PermissionState {
    return requestPermissionAsync().await()
}

inline val DeviceOrientationEvent.Companion.DEVICE_ORIENTATION: EventType<DeviceOrientationEvent>
    get() = EventType("deviceorientation")

inline val DeviceOrientationEvent.Companion.DEVICE_ORIENTATION_ABSOLUTE: EventType<DeviceOrientationEvent>
    get() = EventType("deviceorientationabsolute")
