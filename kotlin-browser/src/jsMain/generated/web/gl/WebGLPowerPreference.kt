// Automatically generated - do not modify!

package web.gl

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
