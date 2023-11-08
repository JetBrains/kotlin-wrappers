// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BackgroundClip {
    companion object {
        @JsValue("border-box")
        val borderBox: BackgroundClip

        @JsValue("content-box")
        val contentBox: BackgroundClip

        @JsValue("padding-box")
        val paddingBox: BackgroundClip
    }
}
