// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
