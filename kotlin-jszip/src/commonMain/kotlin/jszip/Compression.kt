@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package jszip

import seskar.js.JsValue

sealed external interface Compression {
    companion object {
        @JsValue("STORE")
        val STORE: Compression

        @JsValue("DEFLATE")
        val DEFLATE: Compression
    }
}
