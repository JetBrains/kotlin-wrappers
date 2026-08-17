// Automatically generated - do not modify!

package web.selection

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SelectionDirection

inline val SelectionDirection.Companion.forward: SelectionDirection
    get() = unsafeCast("forward")

inline val SelectionDirection.Companion.backward: SelectionDirection
    get() = unsafeCast("backward")

inline val SelectionDirection.Companion.none: SelectionDirection
    get() = unsafeCast("none")
