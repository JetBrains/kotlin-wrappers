// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
