// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface VerticalAlign {
    companion object {
        @JsValue("baseline")
        val baseline: VerticalAlign

        @JsValue("bottom")
        val bottom: VerticalAlign

        @JsValue("middle")
        val middle: VerticalAlign

        @JsValue("sub")
        val sub: VerticalAlign

        @JsValue("super")
        val `super`: VerticalAlign

        @JsValue("text-bottom")
        val textBottom: VerticalAlign

        @JsValue("text-top")
        val textTop: VerticalAlign

        @JsValue("top")
        val top: VerticalAlign
    }
}
