// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

// language=JavaScript
@JsName("""(/*union*/{captions: 'captions', chapters: 'chapters', descriptions: 'descriptions', metadata: 'metadata', subtitles: 'subtitles'}/*union*/)""")
sealed external interface TextTrackKind {
    companion object {
        val captions: TextTrackKind
        val chapters: TextTrackKind
        val descriptions: TextTrackKind
        val metadata: TextTrackKind
        val subtitles: TextTrackKind
    }
}
