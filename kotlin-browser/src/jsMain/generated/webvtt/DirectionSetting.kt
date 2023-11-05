// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface DirectionSetting {
    companion object {
        @JsValue("")
        val none: DirectionSetting

        @JsValue("lr")
        val lr: DirectionSetting

        @JsValue("rl")
        val rl: DirectionSetting
    }
}
