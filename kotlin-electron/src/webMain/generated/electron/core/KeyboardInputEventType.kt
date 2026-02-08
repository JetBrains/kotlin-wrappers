// Automatically generated - do not modify!

package electron.core

sealed external interface KeyboardInputEventType {
    companion object
}

inline val KeyboardInputEventType.Companion.rawKeyDown: KeyboardInputEventType
    get() = js.reflect.unsafeCast("rawKeyDown")

inline val KeyboardInputEventType.Companion.keyDown: KeyboardInputEventType
    get() = js.reflect.unsafeCast("keyDown")

inline val KeyboardInputEventType.Companion.keyUp: KeyboardInputEventType
    get() = js.reflect.unsafeCast("keyUp")

inline val KeyboardInputEventType.Companion.char: KeyboardInputEventType
    get() = js.reflect.unsafeCast("char")
