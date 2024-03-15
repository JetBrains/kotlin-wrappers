// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.EventTarget
import web.events.EventType

/**
 * Events that occur due to the user moving a mouse wheel or similar input device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent)
 */
open external class WheelEvent(
    override val type: EventType<WheelEvent, EventTarget>,
    init: WheelEventInit = definedExternally,
) : MouseEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaMode)
     */
    val deltaMode: DeltaMode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaX)
     */
    val deltaX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaY)
     */
    val deltaY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaZ)
     */
    val deltaZ: Double
    val DOM_DELTA_PIXEL: DeltaMode
    val DOM_DELTA_LINE: DeltaMode
    val DOM_DELTA_PAGE: DeltaMode

    companion object : WheelEventTypes {
        val DOM_DELTA_PIXEL: DeltaMode
        val DOM_DELTA_LINE: DeltaMode
        val DOM_DELTA_PAGE: DeltaMode
    }
}
