// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUPowerPreference {
    companion object {
        @JsValue("low-power")
        val lowPower: GPUPowerPreference

        @JsValue("high-performance")
        val highPerformance: GPUPowerPreference
    }
}
