// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AudioContextState {
    companion object {
        @JsValue("closed")
        val closed: AudioContextState

        @JsValue("running")
        val running: AudioContextState

        @JsValue("suspended")
        val suspended: AudioContextState
    }
}
