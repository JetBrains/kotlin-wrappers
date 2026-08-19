// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode)
 */
@JsUnion
sealed /* union */
external interface ChannelCountMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode#clamped-max)
 */
inline val ChannelCountMode.Companion.clampedMax: ChannelCountMode
    get() = unsafeCast("clamped-max")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode#explicit)
 */
inline val ChannelCountMode.Companion.explicit: ChannelCountMode
    get() = unsafeCast("explicit")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode#max)
 */
inline val ChannelCountMode.Companion.max: ChannelCountMode
    get() = unsafeCast("max")
