// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability)
 */
@JsUnion
sealed /* union */
external interface IDBTransactionDurability

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability#default)
 */
inline val IDBTransactionDurability.Companion.default: IDBTransactionDurability
    get() = unsafeCast("default")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability#relaxed)
 */
inline val IDBTransactionDurability.Companion.relaxed: IDBTransactionDurability
    get() = unsafeCast("relaxed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability#strict)
 */
inline val IDBTransactionDurability.Companion.strict: IDBTransactionDurability
    get() = unsafeCast("strict")
