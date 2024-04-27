// Automatically generated - do not modify!

package web.compression

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CompressionFormat {
    companion object {
        @JsValue("deflate")
        val deflate: CompressionFormat

        @JsValue("deflate-raw")
        val deflateRaw: CompressionFormat

        @JsValue("gzip")
        val gzip: CompressionFormat
    }
}
