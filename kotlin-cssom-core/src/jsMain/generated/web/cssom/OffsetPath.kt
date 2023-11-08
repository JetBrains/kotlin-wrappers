// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface OffsetPath {
    companion object {
        @JsValue("border-box")
        val borderBox: OffsetPath

        @JsValue("content-box")
        val contentBox: OffsetPath

        @JsValue("padding-box")
        val paddingBox: OffsetPath

        @JsValue("fill-box")
        val fillBox: OffsetPath

        @JsValue("margin-box")
        val marginBox: OffsetPath

        @JsValue("stroke-box")
        val strokeBox: OffsetPath

        @JsValue("view-box")
        val viewBox: OffsetPath
    }
}
