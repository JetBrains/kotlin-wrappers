// Automatically generated - do not modify!

package web.navigation

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface NavigationScrollBehavior

inline val NavigationScrollBehavior.Companion.afterTransition: NavigationScrollBehavior
    get() = unsafeCast("after-transition")

inline val NavigationScrollBehavior.Companion.manual: NavigationScrollBehavior
    get() = unsafeCast("manual")
