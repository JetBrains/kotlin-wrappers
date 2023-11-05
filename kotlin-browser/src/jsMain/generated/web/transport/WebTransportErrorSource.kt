// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.transport

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface WebTransportErrorSource {
    companion object {
        @JsValue("session")
        val session: WebTransportErrorSource

        @JsValue("stream")
        val stream: WebTransportErrorSource
    }
}
