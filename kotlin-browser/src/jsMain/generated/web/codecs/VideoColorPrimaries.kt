// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface VideoColorPrimaries {
    companion object {
        @JsValue("bt470bg")
        val bt470bg: VideoColorPrimaries

        @JsValue("bt709")
        val bt709: VideoColorPrimaries

        @JsValue("smpte170m")
        val smpte170m: VideoColorPrimaries
    }
}
