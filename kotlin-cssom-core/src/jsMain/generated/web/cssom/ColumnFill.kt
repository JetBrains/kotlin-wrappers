// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ColumnFill {
    companion object {
        @JsValue("balance")
        val balance: ColumnFill

        @JsValue("balance-all")
        val balanceAll: ColumnFill
    }
}
