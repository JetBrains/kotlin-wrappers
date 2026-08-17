// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface IDBTransactionDurability

inline val IDBTransactionDurability.Companion.default: IDBTransactionDurability
    get() = unsafeCast("default")

inline val IDBTransactionDurability.Companion.relaxed: IDBTransactionDurability
    get() = unsafeCast("relaxed")

inline val IDBTransactionDurability.Companion.strict: IDBTransactionDurability
    get() = unsafeCast("strict")
