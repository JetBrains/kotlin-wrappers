// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fonts

import js.reflect.unsafeCast

sealed external interface FontFaceSetLoadStatus {
    companion object
}

inline val FontFaceSetLoadStatus.Companion.loaded: FontFaceSetLoadStatus
    get() = unsafeCast("loaded")

inline val FontFaceSetLoadStatus.Companion.loading: FontFaceSetLoadStatus
    get() = unsafeCast("loading")
