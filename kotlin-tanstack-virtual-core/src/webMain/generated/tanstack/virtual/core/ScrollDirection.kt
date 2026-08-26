// Automatically generated - do not modify!

package tanstack.virtual.core

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ScrollDirection

inline val ScrollDirection.Companion.forward: ScrollDirection
    get() = unsafeCast("forward")

inline val ScrollDirection.Companion.backward: ScrollDirection
    get() = unsafeCast("backward")
