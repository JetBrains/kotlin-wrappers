// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
