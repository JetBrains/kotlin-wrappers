// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.html

import seskar.js.JsValue

sealed external interface ImageDecoding {
    companion object {
        @JsValue("async")
        val async: ImageDecoding

        @JsValue("sync")
        val sync: ImageDecoding

        @JsValue("auto")
        val auto: ImageDecoding
    }
}
