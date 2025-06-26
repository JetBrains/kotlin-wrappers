// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUDeviceLostReason {
    companion object
}

inline val GPUDeviceLostReason.Companion.destroyed: GPUDeviceLostReason
    get() = unsafeCast("destroyed")

inline val GPUDeviceLostReason.Companion.unknown: GPUDeviceLostReason
    get() = unsafeCast("unknown")
