// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serial

import js.reflect.unsafeCast

sealed external interface FlowControlType {
    companion object
}

inline val FlowControlType.Companion.hardware: FlowControlType
    get() = unsafeCast("hardware")

inline val FlowControlType.Companion.none: FlowControlType
    get() = unsafeCast("none")
