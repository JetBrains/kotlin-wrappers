// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PlaybackDirection

inline val PlaybackDirection.Companion.alternate: PlaybackDirection
    get() = unsafeCast("alternate")

inline val PlaybackDirection.Companion.alternateReverse: PlaybackDirection
    get() = unsafeCast("alternate-reverse")

inline val PlaybackDirection.Companion.normal: PlaybackDirection
    get() = unsafeCast("normal")

inline val PlaybackDirection.Companion.reverse: PlaybackDirection
    get() = unsafeCast("reverse")
