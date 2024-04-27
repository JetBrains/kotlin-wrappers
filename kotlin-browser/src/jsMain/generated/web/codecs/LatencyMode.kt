// Automatically generated - do not modify!

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
