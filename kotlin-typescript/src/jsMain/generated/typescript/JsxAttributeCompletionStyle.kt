// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface JsxAttributeCompletionStyle {
    companion object {
        @JsValue("auto")
        val auto: JsxAttributeCompletionStyle

        @JsValue("braces")
        val braces: JsxAttributeCompletionStyle

        @JsValue("none")
        val none: JsxAttributeCompletionStyle
    }
}
