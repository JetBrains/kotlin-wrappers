// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.popover

import js.reflect.unsafeCast

sealed external interface Popover {
    companion object
}

inline val Popover.Companion.auto: Popover
    get() = unsafeCast("auto")

inline val Popover.Companion.manual: Popover
    get() = unsafeCast("manual")
