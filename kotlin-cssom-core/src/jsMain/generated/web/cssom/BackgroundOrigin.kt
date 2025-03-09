// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface BackgroundOrigin {
    companion object {
        @JsValue("border-box")
        val borderBox: BackgroundOrigin

        @JsValue("content-box")
        val contentBox: BackgroundOrigin

        @JsValue("padding-box")
        val paddingBox: BackgroundOrigin
    }
}
