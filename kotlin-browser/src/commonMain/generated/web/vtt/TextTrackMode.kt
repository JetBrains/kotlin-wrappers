// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.vtt

import seskar.js.JsValue

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
