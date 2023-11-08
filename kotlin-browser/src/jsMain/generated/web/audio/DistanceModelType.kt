// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface DistanceModelType {
    companion object {
        @JsValue("exponential")
        val exponential: DistanceModelType

        @JsValue("inverse")
        val inverse: DistanceModelType

        @JsValue("linear")
        val linear: DistanceModelType
    }
}
