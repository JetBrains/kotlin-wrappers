// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package dom.events

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
    val height: Double
    val isPrimary: Boolean
    val pointerId: Int
    val pointerType: String
    val pressure: Double
    val tangentialPressure: Double
    val tiltX: Int
    val tiltY: Int
    val twist: Int
    val width: Double

    /** Available only in secure contexts. */
    fun getCoalescedEvents(): ReadonlyArray<PointerEvent>
    fun getPredictedEvents(): ReadonlyArray<PointerEvent>

    companion object
}
