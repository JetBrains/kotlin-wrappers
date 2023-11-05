// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface GridAutoFlow {
    companion object {
        @JsValue("column")
        val column: GridAutoFlow

        @JsValue("dense")
        val dense: GridAutoFlow

        @JsValue("row")
        val row: GridAutoFlow
    }
}
