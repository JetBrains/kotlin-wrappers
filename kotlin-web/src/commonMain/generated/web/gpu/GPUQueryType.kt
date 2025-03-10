// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
