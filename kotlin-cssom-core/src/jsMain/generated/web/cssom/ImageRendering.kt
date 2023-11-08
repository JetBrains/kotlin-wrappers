// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ImageRendering {
    companion object {
        @JsValue("crisp-edges")
        val crispEdges: ImageRendering

        @JsValue("pixelated")
        val pixelated: ImageRendering
    }
}
