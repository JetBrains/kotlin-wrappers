// Automatically generated - do not modify!

package web.popover

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PopoverTargetAction

inline val PopoverTargetAction.Companion.hide: PopoverTargetAction
    get() = unsafeCast("hide")

inline val PopoverTargetAction.Companion.show: PopoverTargetAction
    get() = unsafeCast("show")

inline val PopoverTargetAction.Companion.toggle: PopoverTargetAction
    get() = unsafeCast("toggle")
