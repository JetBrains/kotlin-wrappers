// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webgl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WebGLPowerPreference {
    companion object {
        @JsValue("default")
        val default: WebGLPowerPreference

        @JsValue("high-performance")
        val highPerformance: WebGLPowerPreference

        @JsValue("low-power")
        val lowPower: WebGLPowerPreference
    }
}
