// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface VideoPixelFormat {
    companion object {
        @JsValue("BGRA")
        val BGRA: VideoPixelFormat

        @JsValue("BGRX")
        val BGRX: VideoPixelFormat

        @JsValue("I420")
        val I420: VideoPixelFormat

        @JsValue("I420A")
        val I420A: VideoPixelFormat

        @JsValue("I422")
        val I422: VideoPixelFormat

        @JsValue("I444")
        val I444: VideoPixelFormat

        @JsValue("NV12")
        val NV12: VideoPixelFormat

        @JsValue("RGBA")
        val RGBA: VideoPixelFormat

        @JsValue("RGBX")
        val RGBX: VideoPixelFormat
    }
}
