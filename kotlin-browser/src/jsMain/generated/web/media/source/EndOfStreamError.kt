// Automatically generated - do not modify!

package web.media.source

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface EndOfStreamError {
    companion object {
        @JsValue("decode")
        val decode: EndOfStreamError

        @JsValue("network")
        val network: EndOfStreamError
    }
}
