// Automatically generated - do not modify!

package web.popover

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ToggleState

inline val ToggleState.Companion.open: ToggleState
    get() = unsafeCast("open")

inline val ToggleState.Companion.closed: ToggleState
    get() = unsafeCast("closed")
