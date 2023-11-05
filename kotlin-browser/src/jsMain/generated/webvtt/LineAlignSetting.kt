// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface LineAlignSetting {
    companion object {
        @JsValue("center")
        val center: LineAlignSetting

        @JsValue("end")
        val end: LineAlignSetting

        @JsValue("start")
        val start: LineAlignSetting
    }
}
