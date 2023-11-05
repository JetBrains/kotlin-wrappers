// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface IDBTransactionDurability {
    companion object {
        @JsValue("default")
        val default: IDBTransactionDurability

        @JsValue("relaxed")
        val relaxed: IDBTransactionDurability

        @JsValue("strict")
        val strict: IDBTransactionDurability
    }
}
