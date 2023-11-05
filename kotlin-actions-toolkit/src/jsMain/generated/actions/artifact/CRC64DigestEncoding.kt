// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.artifact

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CRC64DigestEncoding {
    companion object {
        @JsValue("hex")
        val hex: CRC64DigestEncoding

        @JsValue("base64")
        val base64: CRC64DigestEncoding

        @JsValue("buffer")
        val buffer: CRC64DigestEncoding
    }
}
