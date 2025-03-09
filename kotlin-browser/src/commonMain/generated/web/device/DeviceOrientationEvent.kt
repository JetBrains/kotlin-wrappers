// Automatically generated - do not modify!

package web.device

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
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
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/absolute)
     */
    val absolute: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/alpha)
     */
    val alpha: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/beta)
     */
    val beta: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DeviceOrientationEvent/gamma)
     */
    val gamma: Double?

    @JsAlias(THIS)
    override fun asInit(): DeviceOrientationEventInit

    companion object {
        @JsValue("deviceorientation")
        val DEVICE_ORIENTATION: EventType<DeviceOrientationEvent>

        @JsValue("deviceorientationabsolute")
        val DEVICE_ORIENTATION_ABSOLUTE: EventType<DeviceOrientationEvent>
    }
}
