// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ShapeOutside {
    companion object {
        @JsValue("border-box")
        val borderBox: ShapeOutside

        @JsValue("content-box")
        val contentBox: ShapeOutside

        @JsValue("padding-box")
        val paddingBox: ShapeOutside

        @JsValue("margin-box")
        val marginBox: ShapeOutside
    }
}
