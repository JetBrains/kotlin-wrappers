// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PaintOrder {
    companion object {
        @JsValue("fill")
        val fill: PaintOrder

        @JsValue("markers")
        val markers: PaintOrder

        @JsValue("normal")
        val normal: PaintOrder

        @JsValue("stroke")
        val stroke: PaintOrder
    }
}
