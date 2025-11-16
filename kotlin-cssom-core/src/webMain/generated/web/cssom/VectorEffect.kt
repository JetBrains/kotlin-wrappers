// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface VectorEffect {
    companion object {
        @JsValue("fixed-position")
        val fixedPosition: VectorEffect

        @JsValue("non-rotation")
        val nonRotation: VectorEffect

        @JsValue("non-scaling-size")
        val nonScalingSize: VectorEffect

        @JsValue("non-scaling-stroke")
        val nonScalingStroke: VectorEffect
    }
}
