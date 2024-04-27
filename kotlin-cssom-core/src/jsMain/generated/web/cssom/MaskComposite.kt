// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MaskComposite {
    companion object {
        @JsValue("add")
        val add: MaskComposite

        @JsValue("exclude")
        val exclude: MaskComposite

        @JsValue("intersect")
        val intersect: MaskComposite

        @JsValue("subtract")
        val subtract: MaskComposite
    }
}
