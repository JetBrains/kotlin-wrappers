// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import js.reflect.unsafeCast

sealed external interface ChannelInterpretation {
    companion object
}

inline val ChannelInterpretation.Companion.discrete: ChannelInterpretation
    get() = unsafeCast("discrete")

inline val ChannelInterpretation.Companion.speakers: ChannelInterpretation
    get() = unsafeCast("speakers")
