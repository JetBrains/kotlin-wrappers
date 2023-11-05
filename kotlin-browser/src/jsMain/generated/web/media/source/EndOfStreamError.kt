// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.source

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface EndOfStreamError {
    companion object {
        @JsValue("decode")
        val decode: EndOfStreamError

        @JsValue("network")
        val network: EndOfStreamError
    }
}
