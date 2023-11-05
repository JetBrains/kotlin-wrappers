// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AlignSetting {
    companion object {
        @JsValue("center")
        val center: AlignSetting

        @JsValue("end")
        val end: AlignSetting

        @JsValue("left")
        val left: AlignSetting

        @JsValue("right")
        val right: AlignSetting

        @JsValue("start")
        val start: AlignSetting
    }
}
