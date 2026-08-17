// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ChannelCountMode

inline val ChannelCountMode.Companion.clampedMax: ChannelCountMode
    get() = unsafeCast("clamped-max")

inline val ChannelCountMode.Companion.explicit: ChannelCountMode
    get() = unsafeCast("explicit")

inline val ChannelCountMode.Companion.max: ChannelCountMode
    get() = unsafeCast("max")
