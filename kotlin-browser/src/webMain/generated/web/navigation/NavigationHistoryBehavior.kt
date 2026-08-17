// Automatically generated - do not modify!

package web.navigation

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface NavigationHistoryBehavior

inline val NavigationHistoryBehavior.Companion.auto: NavigationHistoryBehavior
    get() = unsafeCast("auto")

inline val NavigationHistoryBehavior.Companion.push: NavigationHistoryBehavior
    get() = unsafeCast("push")

inline val NavigationHistoryBehavior.Companion.replace: NavigationHistoryBehavior
    get() = unsafeCast("replace")
