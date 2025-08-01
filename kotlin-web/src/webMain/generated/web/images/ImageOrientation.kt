// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.images

import js.reflect.unsafeCast

sealed external interface ImageOrientation {
    companion object
}

inline val ImageOrientation.Companion.flipY: ImageOrientation
    get() = unsafeCast("flipY")

inline val ImageOrientation.Companion.fromImage: ImageOrientation
    get() = unsafeCast("from-image")

inline val ImageOrientation.Companion.none: ImageOrientation
    get() = unsafeCast("none")
