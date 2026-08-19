// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode)
 */
@JsUnion
sealed /* union */
external interface TextTrackMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode#disabled)
 */
inline val TextTrackMode.Companion.disabled: TextTrackMode
    get() = unsafeCast("disabled")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode#hidden)
 */
inline val TextTrackMode.Companion.hidden: TextTrackMode
    get() = unsafeCast("hidden")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode#showing)
 */
inline val TextTrackMode.Companion.showing: TextTrackMode
    get() = unsafeCast("showing")
