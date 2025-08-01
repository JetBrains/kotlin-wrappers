// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import js.reflect.unsafeCast

sealed external interface ImageDecoding {
    companion object
}

inline val ImageDecoding.Companion.async: ImageDecoding
    get() = unsafeCast("async")

inline val ImageDecoding.Companion.sync: ImageDecoding
    get() = unsafeCast("sync")

inline val ImageDecoding.Companion.auto: ImageDecoding
    get() = unsafeCast("auto")
