// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.popover

import js.reflect.unsafeCast

sealed external interface PopoverTargetAction {
    companion object
}

inline val PopoverTargetAction.Companion.hide: PopoverTargetAction
    get() = unsafeCast("hide")

inline val PopoverTargetAction.Companion.show: PopoverTargetAction
    get() = unsafeCast("show")

inline val PopoverTargetAction.Companion.toggle: PopoverTargetAction
    get() = unsafeCast("toggle")
