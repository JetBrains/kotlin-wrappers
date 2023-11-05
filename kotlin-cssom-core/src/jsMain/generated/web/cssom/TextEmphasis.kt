// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextEmphasis {
    companion object {
        @JsValue("circle")
        val circle: TextEmphasis

        @JsValue("dot")
        val dot: TextEmphasis

        @JsValue("double-circle")
        val doubleCircle: TextEmphasis

        @JsValue("filled")
        val filled: TextEmphasis

        @JsValue("open")
        val open: TextEmphasis

        @JsValue("sesame")
        val sesame: TextEmphasis

        @JsValue("triangle")
        val triangle: TextEmphasis
    }
}
