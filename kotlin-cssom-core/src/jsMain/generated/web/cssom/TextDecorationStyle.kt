// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextDecorationStyle {
    companion object {
        @JsValue("dashed")
        val dashed: TextDecorationStyle

        @JsValue("dotted")
        val dotted: TextDecorationStyle

        @JsValue("double")
        val double: TextDecorationStyle

        @JsValue("solid")
        val solid: TextDecorationStyle

        @JsValue("wavy")
        val wavy: TextDecorationStyle
    }
}
