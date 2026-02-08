// Automatically generated - do not modify!

package electron.core

sealed external interface ClipboardWriteBufferType {
    companion object
}

inline val ClipboardWriteBufferType.Companion.selection: ClipboardWriteBufferType
    get() = js.reflect.unsafeCast("selection")

inline val ClipboardWriteBufferType.Companion.clipboard: ClipboardWriteBufferType
    get() = js.reflect.unsafeCast("clipboard")
