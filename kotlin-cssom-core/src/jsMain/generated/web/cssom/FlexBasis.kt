// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FlexBasis {
    companion object {
        @JsValue("content")
        val content: FlexBasis

        @JsValue("fit-content")
        val fitContent: FlexBasis

        @JsValue("max-content")
        val maxContent: FlexBasis

        @JsValue("min-content")
        val minContent: FlexBasis
    }
}
