// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AvcBitstreamFormat {
    companion object {
        @JsValue("annexb")
        val annexb: AvcBitstreamFormat

        @JsValue("avc")
        val avc: AvcBitstreamFormat
    }
}
