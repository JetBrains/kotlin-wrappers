// Automatically generated - do not modify!

package electron.core

@js.union.JsUnion
sealed external interface ClipboardReadTextType

inline val ClipboardReadTextType.Companion.selection: ClipboardReadTextType
    get() = js.reflect.unsafeCast("selection")

inline val ClipboardReadTextType.Companion.clipboard: ClipboardReadTextType
    get() = js.reflect.unsafeCast("clipboard")
