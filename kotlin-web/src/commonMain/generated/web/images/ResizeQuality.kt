// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.images

import seskar.js.JsValue

sealed external interface ResizeQuality {
    companion object {
        @JsValue("high")
        val high: ResizeQuality

        @JsValue("low")
        val low: ResizeQuality

        @JsValue("medium")
        val medium: ResizeQuality

        @JsValue("pixelated")
        val pixelated: ResizeQuality
    }
}
