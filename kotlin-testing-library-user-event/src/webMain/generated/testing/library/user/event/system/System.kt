// Automatically generated - do not modify!

@file:JsModule("@testing-library/user-event/dist/esm/system/index")

package testing.library.user.event.system

// unhandled import: KeyboardHost from "./keyboard"
// unhandled import: PointerHost from "./pointer"
import testing.library.user.event.system.keyboard.KeyboardHost
import testing.library.user.event.system.pointer.PointerHost

/**
 * @internal Do not create/alter this by yourself as this type might be subject to changes.
 */
external class System {
    val keyboard: KeyboardHost
    val pointer: PointerHost

    fun getUIEventModifiers(): web.uievents.EventModifierInit
}
