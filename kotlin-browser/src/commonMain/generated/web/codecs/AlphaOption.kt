// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface AlphaOption {
    companion object
}

inline val AlphaOption.Companion.discard: AlphaOption
    get() = unsafeCast("discard")

inline val AlphaOption.Companion.keep: AlphaOption
    get() = unsafeCast("keep")
