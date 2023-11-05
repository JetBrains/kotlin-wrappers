// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextEmphasisStyle {
    companion object {
        @JsValue("circle")
        val circle: TextEmphasisStyle

        @JsValue("dot")
        val dot: TextEmphasisStyle

        @JsValue("double-circle")
        val doubleCircle: TextEmphasisStyle

        @JsValue("filled")
        val filled: TextEmphasisStyle

        @JsValue("open")
        val open: TextEmphasisStyle

        @JsValue("sesame")
        val sesame: TextEmphasisStyle

        @JsValue("triangle")
        val triangle: TextEmphasisStyle
    }
}
