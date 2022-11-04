// Automatically generated - do not modify!

package dom.events

import web.events.EventTarget

external interface MouseEventInit : EventModifierInit {
    var button: Short?
    var buttons: Short?
    var clientX: Int?
    var clientY: Int?
    var movementX: Double?
    var movementY: Double?
    var relatedTarget: EventTarget?
    var screenX: Int?
    var screenY: Int?
}

open external class MouseEvent(
    type: String,
    init: MouseEventInit = definedExternally,
) : UIEvent {
    val altKey: Boolean
    val button: Short
    val buttons: Short
    val clientX: Int
    val clientY: Int
    val ctrlKey: Boolean
    val metaKey: Boolean
    val movementX: Double
    val movementY: Double
    val offsetX: Double
    val offsetY: Double
    val pageX: Double
    val pageY: Double
    val relatedTarget: EventTarget?
    val screenX: Int
    val screenY: Int
    val shiftKey: Boolean
    val x: Double
    val y: Double
    fun getModifierState(keyArg: String): Boolean

    companion object
}
