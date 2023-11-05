// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CanvasTextRendering {
    companion object {
        @JsValue("auto")
        val auto: CanvasTextRendering

        @JsValue("geometricPrecision")
        val geometricPrecision: CanvasTextRendering

        @JsValue("optimizeLegibility")
        val optimizeLegibility: CanvasTextRendering

        @JsValue("optimizeSpeed")
        val optimizeSpeed: CanvasTextRendering
    }
}
