// Automatically generated - do not modify!

package react.dom.events

import web.dom.Element

external interface TouchEvent<out T : Element> : UIEvent<T, NativeTouchEvent> {
    val altKey: Boolean
    val changedTouches: web.uievents.TouchList
    val ctrlKey: Boolean

    /**
     * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
     */
    fun getModifierState(key: ModifierKey): Boolean
    val metaKey: Boolean
    val shiftKey: Boolean
    val targetTouches: web.uievents.TouchList
    val touches: web.uievents.TouchList
}
