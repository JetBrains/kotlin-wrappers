// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.codecs

import seskar.js.JsValue

sealed external interface LatencyMode {
    companion object {
        @JsValue("quality")
        val quality: LatencyMode

        @JsValue("realtime")
        val realtime: LatencyMode
    }
}
