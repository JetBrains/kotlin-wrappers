// Automatically generated - do not modify!

package web.popover

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface Popover

inline val Popover.Companion.auto: Popover
    get() = unsafeCast("auto")

inline val Popover.Companion.manual: Popover
    get() = unsafeCast("manual")
