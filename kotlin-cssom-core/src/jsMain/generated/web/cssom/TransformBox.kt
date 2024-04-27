// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
