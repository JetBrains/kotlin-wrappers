// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gl

import js.reflect.unsafeCast

sealed external interface WebGLPowerPreference {
    companion object
}

inline val WebGLPowerPreference.Companion.default: WebGLPowerPreference
    get() = unsafeCast("default")

inline val WebGLPowerPreference.Companion.highPerformance: WebGLPowerPreference
    get() = unsafeCast("highPerformance")

inline val WebGLPowerPreference.Companion.lowPower: WebGLPowerPreference
    get() = unsafeCast("lowPower")
