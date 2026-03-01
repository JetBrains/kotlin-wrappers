// Automatically generated - do not modify!

package testing.library.user.event.pointer

// unhandled import: PointerCoords from "../event"
// unhandled import: Instance from "../setup"
// unhandled import: pointerKey from "../system/pointer"
import testing.library.user.event.system.pointer.shared.pointerKey

external interface PointerPressAction : PointerActionPosition {
    var keyDef: pointerKey
    var releasePrevious: Boolean
    var releaseSelf: Boolean
}
