// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface DynamicRange {
    companion object {
        @JsValue("standard")
        val standard: DynamicRange

        @JsValue("high")
        val high: DynamicRange
    }
}
