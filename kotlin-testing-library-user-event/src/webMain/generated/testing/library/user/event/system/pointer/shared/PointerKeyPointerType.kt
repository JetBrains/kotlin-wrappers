// Automatically generated - do not modify!

package testing.library.user.event.system.pointer.shared

// unhandled import: PointerCoords from "../../event"
// unhandled import: MouseButton from "./buttons"

sealed external interface PointerKeyPointerType {
    companion object
}

inline val PointerKeyPointerType.Companion.mouse: PointerKeyPointerType
    get() = js.reflect.unsafeCast("mouse")

inline val PointerKeyPointerType.Companion.pen: PointerKeyPointerType
    get() = js.reflect.unsafeCast("pen")

inline val PointerKeyPointerType.Companion.touch: PointerKeyPointerType
    get() = js.reflect.unsafeCast("touch")
