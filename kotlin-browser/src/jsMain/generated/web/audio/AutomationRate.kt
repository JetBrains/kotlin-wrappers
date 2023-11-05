// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AutomationRate {
    companion object {
        @JsValue("a-rate")
        val aRate: AutomationRate

        @JsValue("k-rate")
        val kRate: AutomationRate
    }
}
