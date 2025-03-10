// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.transport

import seskar.js.JsValue

sealed external interface WebTransportErrorSource {
    companion object {
        @JsValue("session")
        val session: WebTransportErrorSource

        @JsValue("stream")
        val stream: WebTransportErrorSource
    }
}
