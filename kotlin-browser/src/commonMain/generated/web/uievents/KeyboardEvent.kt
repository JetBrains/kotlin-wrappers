// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import web.keyboard.KeyCode
import web.keyboard.ModifierKeyCode
import kotlin.js.definedExternally

/**
 * **`KeyboardEvent`** objects describe a user interaction with the keyboard; each event describes a single interaction between the user and a key (or combination of a key with modifier keys) on the keyboard.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent)
 */
open external class KeyboardEvent(
    override val type: EventType<KeyboardEvent>,
    init: KeyboardEventInit = definedExternally,
) : UIEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/altKey)
     */
    val altKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/code)
     */
    val code: KeyCode

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/ctrlKey)
     */
    val ctrlKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/isComposing)
     */
    val isComposing: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/key)
     */
    val key: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/location)
     */
    val location: KeyLocation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/metaKey)
     */
    val metaKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/repeat)
     */
    val repeat: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/shiftKey)
     */
    val shiftKey: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/getModifierState)
     */
    fun getModifierState(keyArg: ModifierKeyCode): Boolean
    val DOM_KEY_LOCATION_STANDARD: KeyLocation
    val DOM_KEY_LOCATION_LEFT: KeyLocation
    val DOM_KEY_LOCATION_RIGHT: KeyLocation
    val DOM_KEY_LOCATION_NUMPAD: KeyLocation

    @JsAlias(THIS)
    override fun asInit(): KeyboardEventInit

    companion object {
        val DOM_KEY_LOCATION_STANDARD: KeyLocation
        val DOM_KEY_LOCATION_LEFT: KeyLocation
        val DOM_KEY_LOCATION_RIGHT: KeyLocation
        val DOM_KEY_LOCATION_NUMPAD: KeyLocation

        @JsValue("keydown")
        val KEY_DOWN: EventType<KeyboardEvent>

        @JsValue("keypress")
        val KEY_PRESS: EventType<KeyboardEvent>

        @JsValue("keyup")
        val KEY_UP: EventType<KeyboardEvent>
    }
}
