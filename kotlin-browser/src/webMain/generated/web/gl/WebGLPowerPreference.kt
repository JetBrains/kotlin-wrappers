// Automatically generated - do not modify!

package web.gl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface WebGLPowerPreference

inline val WebGLPowerPreference.Companion.default: WebGLPowerPreference
    get() = unsafeCast("default")

inline val WebGLPowerPreference.Companion.highPerformance: WebGLPowerPreference
    get() = unsafeCast("high-performance")

inline val WebGLPowerPreference.Companion.lowPower: WebGLPowerPreference
    get() = unsafeCast("low-power")
