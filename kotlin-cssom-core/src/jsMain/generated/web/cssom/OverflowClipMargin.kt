// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface OverflowClipMargin {
    companion object {
        @JsValue("border-box")
        val borderBox: OverflowClipMargin

        @JsValue("content-box")
        val contentBox: OverflowClipMargin

        @JsValue("padding-box")
        val paddingBox: OverflowClipMargin
    }
}
