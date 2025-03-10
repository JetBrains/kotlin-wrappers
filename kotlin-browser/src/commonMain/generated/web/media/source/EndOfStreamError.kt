// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.media.source

import seskar.js.JsValue

sealed external interface EndOfStreamError {
    companion object {
        @JsValue("decode")
        val decode: EndOfStreamError

        @JsValue("network")
        val network: EndOfStreamError
    }
}
