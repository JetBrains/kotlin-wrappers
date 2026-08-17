// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface TextTrackKind

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
