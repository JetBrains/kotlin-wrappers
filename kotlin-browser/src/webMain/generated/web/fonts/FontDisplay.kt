// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fonts

import js.reflect.unsafeCast

sealed external interface FontDisplay {
    companion object
}

inline val FontDisplay.Companion.auto: FontDisplay
    get() = unsafeCast("auto")

inline val FontDisplay.Companion.block: FontDisplay
    get() = unsafeCast("block")

inline val FontDisplay.Companion.fallback: FontDisplay
    get() = unsafeCast("fallback")

inline val FontDisplay.Companion.optional: FontDisplay
    get() = unsafeCast("optional")

inline val FontDisplay.Companion.swap: FontDisplay
    get() = unsafeCast("swap")
