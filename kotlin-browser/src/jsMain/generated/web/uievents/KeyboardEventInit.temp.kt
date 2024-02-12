// Automatically generated - do not modify!

package web.uievents

import js.objects.jso
import web.keyboard.KeyCode

inline fun KeyboardEventInit(
    block: KeyboardEventInitMutable.() -> Unit,
): KeyboardEventInit =
    jso(block)

external interface KeyboardEventInitMutable :
    KeyboardEventInit,
    EventModifierInitMutable {
    override var code: KeyCode?
    override var isComposing: Boolean?
    override var key: String?
    override var location: KeyLocation?
    override var repeat: Boolean?
}
