// Automatically generated - do not modify!

package testing.library.user.event.system.pointer.shared

// unhandled import: PointerCoords from "../../event"
// unhandled import: MouseButton from "./buttons"
import testing.library.user.event.system.pointer.buttons.MouseButton

external interface pointerKey {
    /** Name of the pointer key */
    var name: String

    /** Type of the pointer device */
    var pointerType: PointerKeyPointerType

    /** Type of button */
    var button: MouseButton?
}
