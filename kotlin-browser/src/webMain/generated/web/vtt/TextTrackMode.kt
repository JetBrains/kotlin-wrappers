// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface TextTrackMode

inline val TextTrackMode.Companion.disabled: TextTrackMode
    get() = unsafeCast("disabled")

inline val TextTrackMode.Companion.hidden: TextTrackMode
    get() = unsafeCast("hidden")

inline val TextTrackMode.Companion.showing: TextTrackMode
    get() = unsafeCast("showing")
