// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.table.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ColumnPinningPosition {
    companion object {
        @JsValue("false")
        val `false`: ColumnPinningPosition

        @JsValue("left")
        val left: ColumnPinningPosition

        @JsValue("right")
        val right: ColumnPinningPosition
    }
}
