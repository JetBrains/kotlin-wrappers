// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ShapeRadius {
    companion object {
        @JsValue("closest-side")
        val closestSide: ShapeRadius

        @JsValue("farthest-side")
        val farthestSide: ShapeRadius
    }
}
