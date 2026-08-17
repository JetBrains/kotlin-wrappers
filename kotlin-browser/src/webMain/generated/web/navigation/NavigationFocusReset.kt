// Automatically generated - do not modify!

package web.navigation

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface NavigationFocusReset

inline val NavigationFocusReset.Companion.afterTransition: NavigationFocusReset
    get() = unsafeCast("after-transition")

inline val NavigationFocusReset.Companion.manual: NavigationFocusReset
    get() = unsafeCast("manual")
