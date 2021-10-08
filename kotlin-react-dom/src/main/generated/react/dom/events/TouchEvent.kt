// Automatically generated - do not modify!

package react.dom.events

import org.w3c.dom.Element

external interface TouchEvent<T : Element> : UIEvent<T, NativeTouchEvent> {
    val altKey: Boolean
    val changedTouches: org.w3c.dom.TouchList
    val ctrlKey: Boolean

    /**
     * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
     */
    fun getModifierState(key: String): Boolean
    val metaKey: Boolean
    val shiftKey: Boolean
    val targetTouches: org.w3c.dom.TouchList
    val touches: org.w3c.dom.TouchList
}
