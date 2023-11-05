// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ImageSmoothingQuality {
    companion object {
        @JsValue("high")
        val high: ImageSmoothingQuality

        @JsValue("low")
        val low: ImageSmoothingQuality

        @JsValue("medium")
        val medium: ImageSmoothingQuality
    }
}
