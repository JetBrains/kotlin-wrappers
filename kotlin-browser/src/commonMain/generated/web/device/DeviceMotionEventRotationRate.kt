// Automatically generated - do not modify!

package web.device

/**
 * A **`DeviceMotionEventRotationRate`** interface of the Device Orientation Events provides information about the rate at which the device is rotating around all three axes.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventRotationRate)
 */
sealed external interface DeviceMotionEventRotationRate {
    /**
     * The **`alpha`** read-only property of the DeviceMotionEventRotationRate interface indicates the rate of rotation around the Z axis, in degrees per second.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventRotationRate/alpha)
     */
    val alpha: Double?

    /**
     * The **`beta`** read-only property of the DeviceMotionEventRotationRate interface indicates the rate of rotation around the X axis, in degrees per second.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventRotationRate/beta)
     */
    val beta: Double?

    /**
     * The **`gamma`** read-only property of the DeviceMotionEventRotationRate interface indicates the rate of rotation around the Y axis, in degrees per second.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEventRotationRate/gamma)
     */
    val gamma: Double?
}
