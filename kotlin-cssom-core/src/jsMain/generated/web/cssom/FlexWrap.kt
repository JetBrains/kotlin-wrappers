// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FlexWrap {
    companion object {
        @JsValue("nowrap")
        val nowrap: FlexWrap

        @JsValue("wrap")
        val wrap: FlexWrap

        @JsValue("wrap-reverse")
        val wrapReverse: FlexWrap
    }
}
