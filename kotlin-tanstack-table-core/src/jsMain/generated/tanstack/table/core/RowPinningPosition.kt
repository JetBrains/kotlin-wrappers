// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.table.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RowPinningPosition {
    companion object {
        @JsValue("false")
        val `false`: RowPinningPosition

        @JsValue("top")
        val top: RowPinningPosition

        @JsValue("bottom")
        val bottom: RowPinningPosition
    }
}
