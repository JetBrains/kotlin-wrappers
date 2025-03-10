// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.codecs

import seskar.js.JsValue

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
