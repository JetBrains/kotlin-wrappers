// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUPowerPreference {
    companion object
}

inline val GPUPowerPreference.Companion.highPerformance: GPUPowerPreference
    get() = unsafeCast("high-performance")

inline val GPUPowerPreference.Companion.lowPower: GPUPowerPreference
    get() = unsafeCast("low-power")
