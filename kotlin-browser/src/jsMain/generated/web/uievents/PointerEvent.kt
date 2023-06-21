// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import js.core.ReadonlyArray
import web.events.EventType

external interface PointerEventInit : MouseEventInit {
    var coalescedEvents: ReadonlyArray<PointerEvent>?
    var height: Double?
    var isPrimary: Boolean?
    var pointerId: Int?
    var pointerType: String?
    var predictedEvents: ReadonlyArray<PointerEvent>?
    var pressure: Double?
    var tangentialPressure: Double?
    var tiltX: Int?
    var tiltY: Int?
    var twist: Int?
    var width: Double?
}

open external class PointerEvent(
    override val type: EventType<PointerEvent>,
    init: PointerEventInit = definedExternally,
) : MouseEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/height) */
    val height: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/isPrimary) */
    val isPrimary: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerId) */
    val pointerId: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerType) */
    val pointerType: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pressure) */
    val pressure: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tangentialPressure) */
    val tangentialPressure: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltX) */
    val tiltX: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltY) */
    val tiltY: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/twist) */
    val twist: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/width) */
    val width: Double

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getCoalescedEvents)
     */
    fun getCoalescedEvents(): ReadonlyArray<PointerEvent>
    fun getPredictedEvents(): ReadonlyArray<PointerEvent>

    companion object
}
