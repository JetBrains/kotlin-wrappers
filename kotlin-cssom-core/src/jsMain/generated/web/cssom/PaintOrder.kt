// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
