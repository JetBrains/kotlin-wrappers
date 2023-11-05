// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextDecorationLine {
    companion object {
        @JsValue("blink")
        val blink: TextDecorationLine

        @JsValue("grammar-error")
        val grammarError: TextDecorationLine

        @JsValue("line-through")
        val lineThrough: TextDecorationLine

        @JsValue("overline")
        val overline: TextDecorationLine

        @JsValue("spelling-error")
        val spellingError: TextDecorationLine

        @JsValue("underline")
        val underline: TextDecorationLine
    }
}
