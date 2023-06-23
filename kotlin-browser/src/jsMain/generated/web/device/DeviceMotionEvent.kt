// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.device

import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent)
 */
external interface DeviceMotionEventInit : EventInit {
    var acceleration: DeviceMotionEventAccelerationInit?
    var accelerationIncludingGravity: DeviceMotionEventAccelerationInit?
    var interval: Double?
    var rotationRate: DeviceMotionEventRotationRateInit?
}

open external class DeviceMotionEvent(
    override val type: EventType<DeviceMotionEvent>,
    init: DeviceMotionEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/acceleration) */
    val acceleration: DeviceMotionEventAcceleration?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/accelerationIncludingGravity) */
    val accelerationIncludingGravity: DeviceMotionEventAcceleration?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/interval) */
    val interval: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceMotionEvent/rotationRate) */
    val rotationRate: DeviceMotionEventRotationRate?

    companion object
}
