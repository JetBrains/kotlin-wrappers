// Automatically generated - do not modify!

package react.dom.events

import org.w3c.dom.Element
import org.w3c.dom.events.EventTarget

external interface MouseEvent<T : Element, E : NativeMouseEvent> : UIEvent<T, E> {
    val altKey: Boolean
    val button: Int
    val buttons: Int
    val clientX: Double
    val clientY: Double
    val ctrlKey: Boolean

    /**
     * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
     */
    fun getModifierState(key: String): Boolean
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
