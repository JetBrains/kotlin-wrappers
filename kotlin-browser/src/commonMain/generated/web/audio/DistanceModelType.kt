// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue

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
