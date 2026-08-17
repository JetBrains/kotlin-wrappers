// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ChannelInterpretation

inline val ChannelInterpretation.Companion.discrete: ChannelInterpretation
    get() = unsafeCast("discrete")

inline val ChannelInterpretation.Companion.speakers: ChannelInterpretation
    get() = unsafeCast("speakers")
