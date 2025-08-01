// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import js.reflect.unsafeCast

sealed external interface IDBTransactionDurability {
    companion object
}

inline val IDBTransactionDurability.Companion.default: IDBTransactionDurability
    get() = unsafeCast("default")

inline val IDBTransactionDurability.Companion.relaxed: IDBTransactionDurability
    get() = unsafeCast("relaxed")

inline val IDBTransactionDurability.Companion.strict: IDBTransactionDurability
    get() = unsafeCast("strict")
