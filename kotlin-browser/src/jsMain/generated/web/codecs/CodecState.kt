// Automatically generated - do not modify!

package web.codecs

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CodecState {
    companion object {
        @JsValue("closed")
        val closed: CodecState

        @JsValue("configured")
        val configured: CodecState

        @JsValue("unconfigured")
        val unconfigured: CodecState
    }
}
