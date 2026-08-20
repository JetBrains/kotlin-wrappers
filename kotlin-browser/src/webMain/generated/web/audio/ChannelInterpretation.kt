// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation)
 */
@JsUnion
sealed /* union */
external interface ChannelInterpretation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation#discrete)
 */
inline val ChannelInterpretation.Companion.discrete: ChannelInterpretation
    get() = unsafeCast("discrete")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation#speakers)
 */
inline val ChannelInterpretation.Companion.speakers: ChannelInterpretation
    get() = unsafeCast("speakers")
