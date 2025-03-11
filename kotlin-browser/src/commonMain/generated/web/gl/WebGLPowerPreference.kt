// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gl

import seskar.js.JsValue

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
