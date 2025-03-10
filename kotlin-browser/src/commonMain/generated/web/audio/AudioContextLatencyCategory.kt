// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.audio

import seskar.js.JsValue

sealed external interface AudioContextLatencyCategory {
    companion object {
        @JsValue("balanced")
        val balanced: AudioContextLatencyCategory

        @JsValue("interactive")
        val interactive: AudioContextLatencyCategory

        @JsValue("playback")
        val playback: AudioContextLatencyCategory
    }
}
