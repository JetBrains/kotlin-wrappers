// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element

external interface WheelEvent<out T : Element> : MouseEvent<T, NativeWheelEvent> {
    val deltaMode: Int
    val deltaX: Double
    val deltaY: Double
    val deltaZ: Double
}
