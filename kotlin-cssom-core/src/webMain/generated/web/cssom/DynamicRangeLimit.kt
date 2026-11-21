// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface DynamicRangeLimit {
    companion object {
        @JsValue("constrained")
        val constrained: DynamicRangeLimit

        @JsValue("no-limit")
        val noLimit: DynamicRangeLimit

        @JsValue("standard")
        val standard: DynamicRangeLimit
    }
}
