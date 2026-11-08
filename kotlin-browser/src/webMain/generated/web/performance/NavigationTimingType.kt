// Automatically generated - do not modify!

package web.performance

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type)
 */
@JsUnion
sealed /* union */
external interface NavigationTimingType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type#back_forward)
 */
inline val NavigationTimingType.Companion.back_forward: NavigationTimingType
    get() = unsafeCast("back_forward")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type#navigate)
 */
inline val NavigationTimingType.Companion.navigate: NavigationTimingType
    get() = unsafeCast("navigate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type#reload)
 */
inline val NavigationTimingType.Companion.reload: NavigationTimingType
    get() = unsafeCast("reload")
