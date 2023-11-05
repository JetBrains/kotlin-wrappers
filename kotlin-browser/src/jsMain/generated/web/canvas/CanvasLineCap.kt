// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CanvasLineCap {
    companion object {
        @JsValue("butt")
        val butt: CanvasLineCap

        @JsValue("round")
        val round: CanvasLineCap

        @JsValue("square")
        val square: CanvasLineCap
    }
}
