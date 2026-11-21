// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface ReadingFlow {
    companion object {
        @JsValue("flex-flow")
        val flexFlow: ReadingFlow

        @JsValue("flex-visual")
        val flexVisual: ReadingFlow

        @JsValue("grid-columns")
        val gridColumns: ReadingFlow

        @JsValue("grid-order")
        val gridOrder: ReadingFlow

        @JsValue("grid-rows")
        val gridRows: ReadingFlow

        @JsValue("normal")
        val normal: ReadingFlow

        @JsValue("source-order")
        val sourceOrder: ReadingFlow
    }
}
