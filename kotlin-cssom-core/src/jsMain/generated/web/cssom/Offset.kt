// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Offset {
    companion object {
        @JsValue("bottom")
        val bottom: Offset

        @JsValue("center")
        val center: Offset

        @JsValue("left")
        val left: Offset

        @JsValue("right")
        val right: Offset

        @JsValue("top")
        val top: Offset

        @JsValue("border-box")
        val borderBox: Offset

        @JsValue("content-box")
        val contentBox: Offset

        @JsValue("padding-box")
        val paddingBox: Offset

        @JsValue("fill-box")
        val fillBox: Offset

        @JsValue("margin-box")
        val marginBox: Offset

        @JsValue("stroke-box")
        val strokeBox: Offset

        @JsValue("view-box")
        val viewBox: Offset
    }
}
