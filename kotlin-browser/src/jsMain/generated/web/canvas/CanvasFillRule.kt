// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CanvasFillRule {
    companion object {
        @JsValue("evenodd")
        val evenodd: CanvasFillRule

        @JsValue("nonzero")
        val nonzero: CanvasFillRule
    }
}
