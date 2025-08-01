// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.vtt

import js.reflect.unsafeCast

sealed external interface TextTrackKind {
    companion object
}

inline val TextTrackKind.Companion.captions: TextTrackKind
    get() = unsafeCast("captions")

inline val TextTrackKind.Companion.chapters: TextTrackKind
    get() = unsafeCast("chapters")

inline val TextTrackKind.Companion.descriptions: TextTrackKind
    get() = unsafeCast("descriptions")

inline val TextTrackKind.Companion.metadata: TextTrackKind
    get() = unsafeCast("metadata")

inline val TextTrackKind.Companion.subtitles: TextTrackKind
    get() = unsafeCast("subtitles")
