// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUQueryType {
    companion object {
        @JsValue("occlusion")
        val occlusion: GPUQueryType

        @JsValue("timestamp")
        val timestamp: GPUQueryType
    }
}
