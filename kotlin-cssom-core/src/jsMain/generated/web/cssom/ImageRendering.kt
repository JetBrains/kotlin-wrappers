// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ImageRendering {
    companion object {
        @JsValue("crisp-edges")
        val crispEdges: ImageRendering

        @JsValue("pixelated")
        val pixelated: ImageRendering
    }
}
