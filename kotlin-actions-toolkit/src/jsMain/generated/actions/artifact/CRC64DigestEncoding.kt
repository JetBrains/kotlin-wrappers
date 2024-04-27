// Automatically generated - do not modify!

package actions.artifact

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
