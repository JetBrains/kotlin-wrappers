// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface ClipboardWriteType

inline val ClipboardWriteType.Companion.selection: ClipboardWriteType
    get() = js.reflect.unsafeCast("selection")

inline val ClipboardWriteType.Companion.clipboard: ClipboardWriteType
    get() = js.reflect.unsafeCast("clipboard")
