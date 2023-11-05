// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
