// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
