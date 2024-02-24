// Automatically generated - do not modify!

package web.uievents

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface PointerEventInit :
    MouseEventInit {
    val coalescedEvents: ReadonlyArray<PointerEvent<*>>?
    val height: Double?
    val isPrimary: Boolean?
    val pointerId: Int?
    val pointerType: String?
    val predictedEvents: ReadonlyArray<PointerEvent<*>>?
    val pressure: Float?
    val tangentialPressure: Float?
    val tiltX: Int?
    val tiltY: Int?
    val twist: Int?
    val width: Double?
}
