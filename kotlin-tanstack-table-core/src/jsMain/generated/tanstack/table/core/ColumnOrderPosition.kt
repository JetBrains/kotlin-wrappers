// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.table.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ColumnOrderPosition {
    companion object {
        @JsValue("false")
        val `false`: ColumnOrderPosition

        @JsValue("left")
        val left: ColumnOrderPosition

        @JsValue("right")
        val right: ColumnOrderPosition

        @JsValue("center")
        val center: ColumnOrderPosition
    }
}
