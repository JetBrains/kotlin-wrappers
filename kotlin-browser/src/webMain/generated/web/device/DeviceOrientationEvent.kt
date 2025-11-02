// Automatically generated - do not modify!

package web.device

import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

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
    val absolute: Boolean

    /**
     * The **`alpha`** read-only property of the DeviceOrientationEvent interface returns the rotation of the device around the Z axis; that is, the number of degrees by which the device is being twisted around the center of the screen. See Orientation and motion data explained for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/alpha)
     */
    val alpha: Double?

    /**
     * The **`beta`** read-only property of the DeviceOrientationEvent interface returns the rotation of the device around the X axis; that is, the number of degrees, ranged between -180 and 180, by which the device is tipped forward or backward. See Orientation and motion data explained for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/beta)
     */
    val beta: Double?

    /**
     * The **`gamma`** read-only property of the DeviceOrientationEvent interface returns the rotation of the device around the Y axis; that is, the number of degrees, ranged between -90 and 90, by which the device is tilted left or right. See Orientation and motion data explained for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/gamma)
     */
    val gamma: Double?

    companion object
}

inline val DeviceOrientationEvent.Companion.DEVICE_ORIENTATION: EventType<DeviceOrientationEvent>
    get() = EventType("deviceorientation")

inline val DeviceOrientationEvent.Companion.DEVICE_ORIENTATION_ABSOLUTE: EventType<DeviceOrientationEvent>
    get() = EventType("deviceorientationabsolute")
