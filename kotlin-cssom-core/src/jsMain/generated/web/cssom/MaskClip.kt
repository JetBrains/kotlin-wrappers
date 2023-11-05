// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MaskClip {
    companion object {
        @JsValue("border-box")
        val borderBox: MaskClip

        @JsValue("content-box")
        val contentBox: MaskClip

        @JsValue("padding-box")
        val paddingBox: MaskClip

        @JsValue("fill-box")
        val fillBox: MaskClip

        @JsValue("margin-box")
        val marginBox: MaskClip

        @JsValue("stroke-box")
        val strokeBox: MaskClip

        @JsValue("view-box")
        val viewBox: MaskClip

        @JsValue("no-clip")
        val noClip: MaskClip
    }
}
