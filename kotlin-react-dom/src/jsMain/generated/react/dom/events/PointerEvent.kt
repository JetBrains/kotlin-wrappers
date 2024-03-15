// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element

external interface PointerEvent<out T : Element> : MouseEvent<T, NativePointerEvent> {
    val pointerId: Int
    val pressure: Double
    val tangentialPressure: Double
    val tiltX: Double
    val tiltY: Double
    val twist: Int
    val width: Double
    val height: Double
    val pointerType: PointerType
    val isPrimary: Boolean
}
