// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AudioContextLatencyCategory

inline val AudioContextLatencyCategory.Companion.balanced: AudioContextLatencyCategory
    get() = unsafeCast("balanced")

inline val AudioContextLatencyCategory.Companion.interactive: AudioContextLatencyCategory
    get() = unsafeCast("interactive")

inline val AudioContextLatencyCategory.Companion.playback: AudioContextLatencyCategory
    get() = unsafeCast("playback")
