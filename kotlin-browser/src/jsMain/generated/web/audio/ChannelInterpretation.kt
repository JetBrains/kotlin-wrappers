// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ChannelInterpretation {
    companion object {
        @JsValue("discrete")
        val discrete: ChannelInterpretation

        @JsValue("speakers")
        val speakers: ChannelInterpretation
    }
}
