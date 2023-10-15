// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsValue
import web.events.EventType

external interface WheelEventInit : MouseEventInit {
    var deltaMode: Short?
    var deltaX: Double?
    var deltaY: Double?
    var deltaZ: Double?
}

/**
 * Events that occur due to the user moving a mouse wheel or similar input device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent)
 */
open external class WheelEvent(
    override val type: EventType<WheelEvent>,
    init: WheelEventInit = definedExternally,
) : MouseEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaMode) */
    val deltaMode: Short

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaX) */
    val deltaX: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaY) */
    val deltaY: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaZ) */
    val deltaZ: Double
    val DOM_DELTA_PIXEL: Short
    val DOM_DELTA_LINE: Short
    val DOM_DELTA_PAGE: Short

    companion object {
        val DOM_DELTA_PIXEL: Short
        val DOM_DELTA_LINE: Short
        val DOM_DELTA_PAGE: Short

        @JsValue("wheel")
        val WHEEL: EventType<WheelEvent>
    }
}
