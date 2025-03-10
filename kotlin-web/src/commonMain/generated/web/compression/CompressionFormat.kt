// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.compression

import seskar.js.JsValue

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
