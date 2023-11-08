// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ClipPath {
    companion object {
        @JsValue("border-box")
        val borderBox: ClipPath

        @JsValue("content-box")
        val contentBox: ClipPath

        @JsValue("padding-box")
        val paddingBox: ClipPath

        @JsValue("fill-box")
        val fillBox: ClipPath

        @JsValue("margin-box")
        val marginBox: ClipPath

        @JsValue("stroke-box")
        val strokeBox: ClipPath

        @JsValue("view-box")
        val viewBox: ClipPath
    }
}
