// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import js.reflect.unsafeCast

sealed external interface AudioContextLatencyCategory {
    companion object
}

inline val AudioContextLatencyCategory.Companion.balanced: AudioContextLatencyCategory
    get() = unsafeCast("balanced")

inline val AudioContextLatencyCategory.Companion.interactive: AudioContextLatencyCategory
    get() = unsafeCast("interactive")

inline val AudioContextLatencyCategory.Companion.playback: AudioContextLatencyCategory
    get() = unsafeCast("playback")
