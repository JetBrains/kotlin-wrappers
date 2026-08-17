// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUPowerPreference

inline val GPUPowerPreference.Companion.highPerformance: GPUPowerPreference
    get() = unsafeCast("high-performance")

inline val GPUPowerPreference.Companion.lowPower: GPUPowerPreference
    get() = unsafeCast("low-power")
