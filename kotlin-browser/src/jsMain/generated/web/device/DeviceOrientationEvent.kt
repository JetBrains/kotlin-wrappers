// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.device

import seskar.js.JsValue
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface DeviceOrientationEventInit : EventInit {
    var absolute: Boolean?
    var alpha: Double?
    var beta: Double?
    var gamma: Double?
}

/**
 * The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent)
 */
open external class DeviceOrientationEvent(
    override val type: EventType<DeviceOrientationEvent>,
    init: DeviceOrientationEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/absolute) */
    val absolute: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/alpha) */
    val alpha: Double?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/beta) */
    val beta: Double?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/gamma) */
    val gamma: Double?

    companion object {
        @JsValue("deviceorientation")
        val DEVICE_ORIENTATION: EventType<DeviceOrientationEvent>
    }
}
