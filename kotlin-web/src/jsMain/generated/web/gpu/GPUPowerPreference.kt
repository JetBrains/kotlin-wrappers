// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUPowerPreference {
    companion object {
        @JsValue("low-power")
        val lowPower: GPUPowerPreference

        @JsValue("high-performance")
        val highPerformance: GPUPowerPreference
    }
}
