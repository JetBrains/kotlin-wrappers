// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.vtt

import js.reflect.unsafeCast

sealed external interface TextTrackMode {
    companion object
}

inline val TextTrackMode.Companion.disabled: TextTrackMode
    get() = unsafeCast("disabled")

inline val TextTrackMode.Companion.hidden: TextTrackMode
    get() = unsafeCast("hidden")

inline val TextTrackMode.Companion.showing: TextTrackMode
    get() = unsafeCast("showing")
