// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GeometryBox : BasicShape {
    companion object {
        @JsValue("border-box")
        val borderBox: GeometryBox

        @JsValue("padding-box")
        val paddingBox: GeometryBox

        @JsValue("content-box")
        val contentBox: GeometryBox

        @JsValue("margin-box")
        val marginBox: GeometryBox
    }
}
