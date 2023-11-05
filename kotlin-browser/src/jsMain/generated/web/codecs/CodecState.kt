// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
