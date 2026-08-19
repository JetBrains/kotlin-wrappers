// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode)
 */
@JsUnion
sealed /* union */
external interface IDBTransactionMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode#readonly)
 */
inline val IDBTransactionMode.Companion.readonly: IDBTransactionMode
    get() = unsafeCast("readonly")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode#readwrite)
 */
inline val IDBTransactionMode.Companion.readwrite: IDBTransactionMode
    get() = unsafeCast("readwrite")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode#versionchange)
 */
inline val IDBTransactionMode.Companion.versionchange: IDBTransactionMode
    get() = unsafeCast("versionchange")
