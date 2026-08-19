// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind)
 */
@JsUnion
sealed /* union */
external interface TextTrackKind

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind#captions)
 */
inline val TextTrackKind.Companion.captions: TextTrackKind
    get() = unsafeCast("captions")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind#chapters)
 */
inline val TextTrackKind.Companion.chapters: TextTrackKind
    get() = unsafeCast("chapters")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind#descriptions)
 */
inline val TextTrackKind.Companion.descriptions: TextTrackKind
    get() = unsafeCast("descriptions")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind#metadata)
 */
inline val TextTrackKind.Companion.metadata: TextTrackKind
    get() = unsafeCast("metadata")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind#subtitles)
 */
inline val TextTrackKind.Companion.subtitles: TextTrackKind
    get() = unsafeCast("subtitles")
