// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
