// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsValue

sealed external interface OpusBitstreamFormat {
    companion object {
        @JsValue("ogg")
        val ogg: OpusBitstreamFormat

        @JsValue("opus")
        val opus: OpusBitstreamFormat
    }
}
