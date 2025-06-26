// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.navigation

import js.reflect.unsafeCast

sealed external interface NavigationType {
    companion object
}

inline val NavigationType.Companion.push: NavigationType
    get() = unsafeCast("push")

inline val NavigationType.Companion.reload: NavigationType
    get() = unsafeCast("reload")

inline val NavigationType.Companion.replace: NavigationType
    get() = unsafeCast("replace")

inline val NavigationType.Companion.traverse: NavigationType
    get() = unsafeCast("traverse")
