// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextDecoration {
    companion object {
        @JsValue("blink")
        val blink: TextDecoration

        @JsValue("dashed")
        val dashed: TextDecoration

        @JsValue("dotted")
        val dotted: TextDecoration

        @JsValue("double")
        val double: TextDecoration

        @JsValue("from-font")
        val fromFont: TextDecoration

        @JsValue("grammar-error")
        val grammarError: TextDecoration

        @JsValue("line-through")
        val lineThrough: TextDecoration

        @JsValue("overline")
        val overline: TextDecoration

        @JsValue("solid")
        val solid: TextDecoration

        @JsValue("spelling-error")
        val spellingError: TextDecoration

        @JsValue("underline")
        val underline: TextDecoration

        @JsValue("wavy")
        val wavy: TextDecoration
    }
}
