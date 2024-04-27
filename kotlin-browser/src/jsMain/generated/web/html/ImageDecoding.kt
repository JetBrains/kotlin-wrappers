// Automatically generated - do not modify!

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
