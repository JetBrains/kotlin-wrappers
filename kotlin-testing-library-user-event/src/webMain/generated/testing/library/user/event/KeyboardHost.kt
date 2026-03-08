// Automatically generated - do not modify!

@file:JsModule("@testing-library/user-event/dist/esm/system/keyboard.js")

package testing.library.user.event

// unhandled import: Instance from "../setup"
// unhandled import: System from "."

external class KeyboardHost {
    constructor (system: System)

    val system: System
    val modifiers: KeyboardHostModifiers
    var carryChar: String

    fun isKeyPressed(keyDef: keyboardKey): Boolean

    fun getPressedKeys(): js.array.ReadonlyArray<keyboardKey>

    /** Press a key */
    @JsName("keydown")
    fun keydownAsync(
        instance: Instance,
        keyDef: keyboardKey,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun keydown(
        instance: Instance,
        keyDef: keyboardKey,
    ): js.core.Void

    /** Release a key */
    @JsName("keyup")
    fun keyupAsync(
        instance: Instance,
        keyDef: keyboardKey,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun keyup(
        instance: Instance,
        keyDef: keyboardKey,
    ): js.core.Void
}
