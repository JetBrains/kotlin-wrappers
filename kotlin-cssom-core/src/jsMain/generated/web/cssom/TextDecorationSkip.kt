// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextDecorationSkip {
    companion object {
        @JsValue("box-decoration")
        val boxDecoration: TextDecorationSkip

        @JsValue("edges")
        val edges: TextDecorationSkip

        @JsValue("leading-spaces")
        val leadingSpaces: TextDecorationSkip

        @JsValue("objects")
        val objects: TextDecorationSkip

        @JsValue("spaces")
        val spaces: TextDecorationSkip

        @JsValue("trailing-spaces")
        val trailingSpaces: TextDecorationSkip
    }
}
