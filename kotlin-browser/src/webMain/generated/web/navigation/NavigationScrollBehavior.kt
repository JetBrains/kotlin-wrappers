// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.navigation

import js.reflect.unsafeCast

sealed external interface NavigationScrollBehavior {
    companion object
}

inline val NavigationScrollBehavior.Companion.afterTransition: NavigationScrollBehavior
    get() = unsafeCast("after-transition")

inline val NavigationScrollBehavior.Companion.manual: NavigationScrollBehavior
    get() = unsafeCast("manual")
