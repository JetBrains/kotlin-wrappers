// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface VideoTransferCharacteristics {
    companion object {
        @JsValue("bt709")
        val bt709: VideoTransferCharacteristics

        @JsValue("iec61966-2-1")
        val iec6196621: VideoTransferCharacteristics

        @JsValue("smpte170m")
        val smpte170m: VideoTransferCharacteristics
    }
}
