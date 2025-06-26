// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.locks

import js.reflect.unsafeCast

sealed external interface LockMode {
    companion object
}

inline val LockMode.Companion.exclusive: LockMode
    get() = unsafeCast("exclusive")

inline val LockMode.Companion.shared: LockMode
    get() = unsafeCast("shared")
