// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.scroll

import js.reflect.unsafeCast

sealed external interface ScrollBehavior {
    companion object
}

inline val ScrollBehavior.Companion.auto: ScrollBehavior
    get() = unsafeCast("auto")

inline val ScrollBehavior.Companion.instant: ScrollBehavior
    get() = unsafeCast("instant")

inline val ScrollBehavior.Companion.smooth: ScrollBehavior
    get() = unsafeCast("smooth")
