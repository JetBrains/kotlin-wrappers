// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsValue

sealed external interface ChannelInterpretation {
    companion object {
        @JsValue("discrete")
        val discrete: ChannelInterpretation

        @JsValue("speakers")
        val speakers: ChannelInterpretation
    }
}
