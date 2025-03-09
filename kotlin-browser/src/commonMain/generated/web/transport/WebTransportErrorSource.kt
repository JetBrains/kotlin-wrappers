// Automatically generated - do not modify!

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
