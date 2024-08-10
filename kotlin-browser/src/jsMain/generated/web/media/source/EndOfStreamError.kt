// Automatically generated - do not modify!

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
