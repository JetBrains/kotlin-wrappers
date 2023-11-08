// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface OverSampleType {
    companion object {
        @JsValue("2x")
        val x2: OverSampleType

        @JsValue("4x")
        val x4: OverSampleType

        @JsValue("none")
        val none: OverSampleType
    }
}
