// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

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
