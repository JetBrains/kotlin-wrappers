// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TransformBox {
    companion object {
        @JsValue("border-box")
        val borderBox: TransformBox

        @JsValue("content-box")
        val contentBox: TransformBox

        @JsValue("fill-box")
        val fillBox: TransformBox

        @JsValue("stroke-box")
        val strokeBox: TransformBox

        @JsValue("view-box")
        val viewBox: TransformBox
    }
}
