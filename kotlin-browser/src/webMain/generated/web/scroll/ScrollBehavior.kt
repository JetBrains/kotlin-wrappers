// Automatically generated - do not modify!

package web.scroll

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ScrollBehavior

inline val ScrollBehavior.Companion.auto: ScrollBehavior
    get() = unsafeCast("auto")

inline val ScrollBehavior.Companion.instant: ScrollBehavior
    get() = unsafeCast("instant")

inline val ScrollBehavior.Companion.smooth: ScrollBehavior
    get() = unsafeCast("smooth")
