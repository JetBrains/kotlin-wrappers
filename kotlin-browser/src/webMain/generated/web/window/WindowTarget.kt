// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.window

import js.reflect.unsafeCast

sealed external interface WindowTarget {
    companion object
}

inline val WindowTarget.Companion._self: WindowTarget
    get() = unsafeCast("_self")

inline val WindowTarget.Companion._blank: WindowTarget
    get() = unsafeCast("_blank")

inline val WindowTarget.Companion._parent: WindowTarget
    get() = unsafeCast("_parent")

inline val WindowTarget.Companion._top: WindowTarget
    get() = unsafeCast("_top")
