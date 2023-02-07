// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.EventType
import web.keyboard.KeyCode
import web.keyboard.ModifierKeyCode

external interface KeyboardEventInit : EventModifierInit {
    var code: KeyCode?
    var isComposing: Boolean?
    var key: String?
    var location: Short?
    var repeat: Boolean?
}

open external class KeyboardEvent(
    override val type: EventType<KeyboardEvent>,
    init: KeyboardEventInit = definedExternally,
) : UIEvent {
    val altKey: Boolean
    val code: KeyCode
    val ctrlKey: Boolean
    val isComposing: Boolean
    val key: String
    val location: Short
    val metaKey: Boolean
    val repeat: Boolean
    val shiftKey: Boolean
    fun getModifierState(keyArg: ModifierKeyCode): Boolean
    val DOM_KEY_LOCATION_STANDARD: Short
    val DOM_KEY_LOCATION_LEFT: Short
    val DOM_KEY_LOCATION_RIGHT: Short
    val DOM_KEY_LOCATION_NUMPAD: Short

    companion object {
        val DOM_KEY_LOCATION_STANDARD: Short
        val DOM_KEY_LOCATION_LEFT: Short
        val DOM_KEY_LOCATION_RIGHT: Short
        val DOM_KEY_LOCATION_NUMPAD: Short
    }
}
