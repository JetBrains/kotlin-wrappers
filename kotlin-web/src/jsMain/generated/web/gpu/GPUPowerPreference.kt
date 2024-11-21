// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUPowerPreference {
    companion object {
        @JsValue("high-performance")
        val highPerformance: GPUPowerPreference

        @JsValue("low-power")
        val lowPower: GPUPowerPreference
    }
}
