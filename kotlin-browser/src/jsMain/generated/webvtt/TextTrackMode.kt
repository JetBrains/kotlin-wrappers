// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TextTrackMode {
    companion object {
        @JsValue("disabled")
        val disabled: TextTrackMode

        @JsValue("hidden")
        val hidden: TextTrackMode

        @JsValue("showing")
        val showing: TextTrackMode
    }
}
