// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fonts

import js.reflect.unsafeCast

sealed external interface FontFaceLoadStatus {
    companion object
}

inline val FontFaceLoadStatus.Companion.error: FontFaceLoadStatus
    get() = unsafeCast("error")

inline val FontFaceLoadStatus.Companion.loaded: FontFaceLoadStatus
    get() = unsafeCast("loaded")

inline val FontFaceLoadStatus.Companion.loading: FontFaceLoadStatus
    get() = unsafeCast("loading")

inline val FontFaceLoadStatus.Companion.unloaded: FontFaceLoadStatus
    get() = unsafeCast("unloaded")
