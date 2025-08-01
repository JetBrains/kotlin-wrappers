// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import js.reflect.unsafeCast

sealed external interface PlaybackDirection {
    companion object
}

inline val PlaybackDirection.Companion.alternate: PlaybackDirection
    get() = unsafeCast("alternate")

inline val PlaybackDirection.Companion.alternateReverse: PlaybackDirection
    get() = unsafeCast("alternate-reverse")

inline val PlaybackDirection.Companion.normal: PlaybackDirection
    get() = unsafeCast("normal")

inline val PlaybackDirection.Companion.reverse: PlaybackDirection
    get() = unsafeCast("reverse")
