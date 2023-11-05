// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
