// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface LatencyMode {
    companion object {
        @JsValue("quality")
        val quality: LatencyMode

        @JsValue("realtime")
        val realtime: LatencyMode
    }
}
