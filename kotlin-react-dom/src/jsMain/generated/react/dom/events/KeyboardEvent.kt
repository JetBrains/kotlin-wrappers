// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element
import web.keyboard.KeyCode
import web.keyboard.ModifierKeyCode

external interface KeyboardEvent<out T : Element> : UIEvent<T, NativeKeyboardEvent<T>> {
    val altKey: Boolean
    val ctrlKey: Boolean
    val code: KeyCode

    /**
     * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
     */
    fun getModifierState(key: ModifierKeyCode): Boolean

    /**
     * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
     */
    val key: String
    val locale: String
    val location: Int
    val metaKey: Boolean
    val repeat: Boolean
    val shiftKey: Boolean
}
