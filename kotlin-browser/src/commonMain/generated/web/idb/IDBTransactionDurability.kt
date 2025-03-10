// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
