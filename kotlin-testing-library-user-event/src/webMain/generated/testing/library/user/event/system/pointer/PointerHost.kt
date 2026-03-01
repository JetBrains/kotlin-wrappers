// Automatically generated - do not modify!

@file:JsModule("@testing-library/user-event/dist/esm/system/pointer/index")

package testing.library.user.event.system.pointer

// unhandled import: System from ".."
// unhandled import: Instance from "../../setup"
// unhandled import: pointerKey from "./shared"
// unhandled import: PointerPosition from "./shared"
import testing.library.user.event.setup.setup.Instance
import testing.library.user.event.system.System
import testing.library.user.event.system.pointer.shared.PointerPosition
import testing.library.user.event.system.pointer.shared.pointerKey

external class PointerHost {
    constructor (system: System)

    val system: System

    fun isKeyPressed(keyDef: pointerKey): Boolean

    fun press(
        instance: Instance,
        keyDef: pointerKey,
        position: PointerPosition,
    ): js.promise.Promise<js.core.Void>

    fun move(
        instance: Instance,
        pointerName: String,
        position: PointerPosition,
    ): js.promise.Promise<js.core.Void>

    fun release(
        instance: Instance,
        keyDef: pointerKey,
        position: PointerPosition,
    ): js.promise.Promise<js.core.Void>

    fun getPointerName(keyDef: pointerKey): String

    fun getPreviousPosition(pointerName: String): PointerPosition?

    fun resetClickCount()

    fun getMouseTarget(instance: Instance): web.dom.Element

    fun setMousePosition(position: PointerPosition)
}
