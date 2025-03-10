// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.codecs

import seskar.js.JsValue

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
