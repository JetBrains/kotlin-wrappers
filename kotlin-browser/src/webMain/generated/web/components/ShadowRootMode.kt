// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.components

import js.reflect.unsafeCast

sealed external interface ShadowRootMode {
    companion object
}

inline val ShadowRootMode.Companion.closed: ShadowRootMode
    get() = unsafeCast("closed")

inline val ShadowRootMode.Companion.open: ShadowRootMode
    get() = unsafeCast("open")
