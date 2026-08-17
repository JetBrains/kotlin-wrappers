// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface IDBTransactionMode

inline val IDBTransactionMode.Companion.readonly: IDBTransactionMode
    get() = unsafeCast("readonly")

inline val IDBTransactionMode.Companion.readwrite: IDBTransactionMode
    get() = unsafeCast("readwrite")

inline val IDBTransactionMode.Companion.versionchange: IDBTransactionMode
    get() = unsafeCast("versionchange")
