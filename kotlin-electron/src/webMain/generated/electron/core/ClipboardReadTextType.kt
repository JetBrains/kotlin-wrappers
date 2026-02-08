// Automatically generated - do not modify!

package electron.core

sealed external interface ClipboardReadTextType {
    companion object
}

inline val ClipboardReadTextType.Companion.selection: ClipboardReadTextType
    get() = js.reflect.unsafeCast("selection")

inline val ClipboardReadTextType.Companion.clipboard: ClipboardReadTextType
    get() = js.reflect.unsafeCast("clipboard")
