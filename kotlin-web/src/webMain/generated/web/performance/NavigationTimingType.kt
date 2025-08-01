// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.performance

import js.reflect.unsafeCast

sealed external interface NavigationTimingType {
    companion object
}

inline val NavigationTimingType.Companion.back_forward: NavigationTimingType
    get() = unsafeCast("back_forward")

inline val NavigationTimingType.Companion.navigate: NavigationTimingType
    get() = unsafeCast("navigate")

inline val NavigationTimingType.Companion.prerender: NavigationTimingType
    get() = unsafeCast("prerender")

inline val NavigationTimingType.Companion.reload: NavigationTimingType
    get() = unsafeCast("reload")
