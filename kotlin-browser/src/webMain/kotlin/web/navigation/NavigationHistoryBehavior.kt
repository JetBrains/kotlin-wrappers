@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.navigation

import js.reflect.unsafeCast

sealed external interface NavigationHistoryBehavior {
    companion object
}

inline val NavigationHistoryBehavior.Companion.auto: NavigationHistoryBehavior
    get() = unsafeCast("auto")

inline val NavigationHistoryBehavior.Companion.push: NavigationHistoryBehavior
    get() = unsafeCast("push")

inline val NavigationHistoryBehavior.Companion.replace: NavigationHistoryBehavior
    get() = unsafeCast("replace")
