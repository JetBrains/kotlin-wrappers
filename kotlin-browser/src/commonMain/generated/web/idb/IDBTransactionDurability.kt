// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue

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
