// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FlexDirection {
    companion object {
        @JsValue("column")
        val column: FlexDirection

        @JsValue("column-reverse")
        val columnReverse: FlexDirection

        @JsValue("row")
        val row: FlexDirection

        @JsValue("row-reverse")
        val rowReverse: FlexDirection
    }
}
