// Automatically generated - do not modify!

package electron.core

sealed external interface ClipboardWriteType {
    companion object
}

inline val ClipboardWriteType.Companion.selection: ClipboardWriteType
    get() = js.reflect.unsafeCast("selection")

inline val ClipboardWriteType.Companion.clipboard: ClipboardWriteType
    get() = js.reflect.unsafeCast("clipboard")
