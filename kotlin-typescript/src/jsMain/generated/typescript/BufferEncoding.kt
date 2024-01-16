// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BufferEncoding {
    companion object {
        @JsValue("ascii")
        val ascii: BufferEncoding

        @JsValue("utf8")
        val utf8: BufferEncoding

        @JsValue("utf16le")
        val utf16le: BufferEncoding

        @JsValue("ucs2")
        val ucs2: BufferEncoding

        @JsValue("base64")
        val base64: BufferEncoding

        @JsValue("latin1")
        val latin1: BufferEncoding

        @JsValue("binary")
        val binary: BufferEncoding

        @JsValue("hex")
        val hex: BufferEncoding
    }
}
