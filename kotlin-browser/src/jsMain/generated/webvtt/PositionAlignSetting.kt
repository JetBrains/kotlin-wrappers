// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PositionAlignSetting {
    companion object {
        @JsValue("auto")
        val auto: PositionAlignSetting

        @JsValue("center")
        val center: PositionAlignSetting

        @JsValue("line-left")
        val lineLeft: PositionAlignSetting

        @JsValue("line-right")
        val lineRight: PositionAlignSetting
    }
}
