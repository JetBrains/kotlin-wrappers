// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.navigation

import js.reflect.unsafeCast

sealed external interface NavigationFocusReset {
    companion object
}

inline val NavigationFocusReset.Companion.afterTransition: NavigationFocusReset
    get() = unsafeCast("after-transition")

inline val NavigationFocusReset.Companion.manual: NavigationFocusReset
    get() = unsafeCast("manual")
