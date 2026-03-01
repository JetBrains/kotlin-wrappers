// Automatically generated - do not modify!

@file:JsModule("@testing-library/user-event/dist/esm/system/keyboard")

package testing.library.user.event.system.keyboard

// unhandled import: Instance from "../setup"
// unhandled import: System from "."
import testing.library.user.event.setup.setup.Instance
import testing.library.user.event.system.System

external class KeyboardHost {
    constructor (system: System)

    val system: System
    val modifiers: KeyboardHostModifiers
    var carryChar: String

    fun isKeyPressed(keyDef: keyboardKey): Boolean

    fun getPressedKeys(): js.array.ReadonlyArray<keyboardKey>

    /** Press a key */
    fun keydown(
        instance: Instance,
        keyDef: keyboardKey,
    ): js.promise.Promise<js.core.Void>

    /** Release a key */
    fun keyup(
        instance: Instance,
        keyDef: keyboardKey,
    ): js.promise.Promise<js.core.Void>
}
