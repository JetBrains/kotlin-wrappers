// Automatically generated - do not modify!

package web.uievents

import js.reflect.unsafeCast
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`WheelEvent`** interface represents events that occur due to the user moving a mouse wheel or similar input device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent)
 */
open external class WheelEvent(
    override val type: EventType<WheelEvent>,
    init: WheelEventInit = definedExternally,
) : MouseEvent {
    /**
     * The **`WheelEvent.deltaMode`** read-only property returns an `unsigned long` representing the unit of the delta values scroll amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaMode)
     */
    val deltaMode: DeltaMode

    /**
     * The **`WheelEvent.deltaX`** read-only property is a `double` representing the horizontal scroll amount in the You must check the `deltaMode` property to determine the unit of the `deltaX` value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaX)
     */
    val deltaX: Double

    /**
     * The **`WheelEvent.deltaY`** read-only property is a `double` representing the vertical scroll amount in the You must check the `deltaMode` property to determine the unit of the `deltaY` value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaY)
     */
    val deltaY: Double

    /**
     * The **`WheelEvent.deltaZ`** read-only property is a `double` representing the scroll amount along the z-axis, in the You must check the `deltaMode` property to determine the unit of the `deltaZ` value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaZ)
     */
    val deltaZ: Double
    val DOM_DELTA_PIXEL: DeltaMode
    val DOM_DELTA_LINE: DeltaMode
    val DOM_DELTA_PAGE: DeltaMode

    companion object {
        val DOM_DELTA_PIXEL: DeltaMode
        val DOM_DELTA_LINE: DeltaMode
        val DOM_DELTA_PAGE: DeltaMode
    }
}

inline fun WheelEvent.asInit(): WheelEventInit =
    unsafeCast(this)

inline val WheelEvent.Companion.WHEEL: EventType<WheelEvent>
    get() = EventType("wheel")
