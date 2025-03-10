// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
