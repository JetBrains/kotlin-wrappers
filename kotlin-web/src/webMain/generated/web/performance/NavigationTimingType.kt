// Automatically generated - do not modify!

package web.performance

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface NavigationTimingType

inline val NavigationTimingType.Companion.back_forward: NavigationTimingType
    get() = unsafeCast("back_forward")

inline val NavigationTimingType.Companion.navigate: NavigationTimingType
    get() = unsafeCast("navigate")

inline val NavigationTimingType.Companion.reload: NavigationTimingType
    get() = unsafeCast("reload")
