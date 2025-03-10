// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.vtt

import seskar.js.JsValue

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
