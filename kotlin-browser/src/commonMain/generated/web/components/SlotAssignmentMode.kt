// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.components

import js.reflect.unsafeCast

sealed external interface SlotAssignmentMode {
    companion object
}

inline val SlotAssignmentMode.Companion.manual: SlotAssignmentMode
    get() = unsafeCast("manual")

inline val SlotAssignmentMode.Companion.named: SlotAssignmentMode
    get() = unsafeCast("named")
