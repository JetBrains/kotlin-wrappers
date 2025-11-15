// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface MaskOrigin {
    companion object {
        @JsValue("border-box")
        val borderBox: MaskOrigin

        @JsValue("content-box")
        val contentBox: MaskOrigin

        @JsValue("padding-box")
        val paddingBox: MaskOrigin

        @JsValue("fill-box")
        val fillBox: MaskOrigin

        @JsValue("stroke-box")
        val strokeBox: MaskOrigin

        @JsValue("view-box")
        val viewBox: MaskOrigin
    }
}
