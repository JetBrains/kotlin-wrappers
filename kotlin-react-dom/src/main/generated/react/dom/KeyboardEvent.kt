// Automatically generated - do not modify!

package react.dom

import org.w3c.dom.Element

external interface KeyboardEvent<T : Element> : SyntheticEvent<T, NativeKeyboardEvent> {
    val altKey: Boolean

    @Deprecated("Will be removed soon!")
    val charCode: Int
    val ctrlKey: Boolean
    val code: String

    /**
     * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
     */
    fun getModifierState(key: String): Boolean

    /**
     * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
     */
    val key: String

    @Deprecated("Will be removed soon!")
    val keyCode: Int
    val locale: String
    val location: Int
    val metaKey: Boolean
    val repeat: Boolean
    val shiftKey: Boolean

    @Deprecated("Will be removed soon!")
    val which: Int
}
