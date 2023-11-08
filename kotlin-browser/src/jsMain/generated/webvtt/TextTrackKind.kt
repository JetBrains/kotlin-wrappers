// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TextTrackKind {
    companion object {
        @JsValue("captions")
        val captions: TextTrackKind

        @JsValue("chapters")
        val chapters: TextTrackKind

        @JsValue("descriptions")
        val descriptions: TextTrackKind

        @JsValue("metadata")
        val metadata: TextTrackKind

        @JsValue("subtitles")
        val subtitles: TextTrackKind
    }
}
