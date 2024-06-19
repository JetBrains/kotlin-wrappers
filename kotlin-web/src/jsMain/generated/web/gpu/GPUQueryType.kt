// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUQueryType {
    companion object {
        @JsValue("occlusion")
        val occlusion: GPUQueryType

        @JsValue("timestamp")
        val timestamp: GPUQueryType
    }
}
