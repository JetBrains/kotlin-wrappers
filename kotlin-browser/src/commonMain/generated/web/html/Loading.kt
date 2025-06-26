// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import js.reflect.unsafeCast

sealed external interface Loading {
    companion object
}

inline val Loading.Companion.eager: Loading
    get() = unsafeCast("eager")

inline val Loading.Companion.lazy: Loading
    get() = unsafeCast("lazy")
