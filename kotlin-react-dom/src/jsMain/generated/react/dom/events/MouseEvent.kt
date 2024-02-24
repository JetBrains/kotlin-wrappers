// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.events.EventTarget
import web.keyboard.ModifierKeyCode
import web.uievents.MouseButton
import web.uievents.MouseButtons

external interface MouseEvent<out T : Element, out E : NativeMouseEvent<T>> : UIEvent<T, E> {
    val altKey: Boolean
    val button: MouseButton
    val buttons: MouseButtons
    val clientX: Double
    val clientY: Double
    val ctrlKey: Boolean

    /**
     * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
     */
    fun getModifierState(key: ModifierKeyCode): Boolean
    val metaKey: Boolean
    val movementX: Double
    val movementY: Double
    val pageX: Double
    val pageY: Double
    val relatedTarget: EventTarget?
    val screenX: Double
    val screenY: Double
    val shiftKey: Boolean
}
