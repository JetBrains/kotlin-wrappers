// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.device

import web.events.Event
import web.events.EventType

/**
 * The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent)
 */
open external class DeviceOrientationEvent(
    override val type: EventType<DeviceOrientationEvent>,
    init: DeviceOrientationEventInit = definedExternally,
) : Event,
    DeviceOrientationEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/absolute)
     */
    override val absolute: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/alpha)
     */
    override val alpha: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/beta)
     */
    override val beta: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/gamma)
     */
    override val gamma: Double?

    companion object : DeviceOrientationEventTypes
}
