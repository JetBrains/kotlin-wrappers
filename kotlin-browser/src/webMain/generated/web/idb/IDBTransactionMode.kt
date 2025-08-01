// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import js.reflect.unsafeCast

sealed external interface IDBTransactionMode {
    companion object
}

inline val IDBTransactionMode.Companion.readonly: IDBTransactionMode
    get() = unsafeCast("readonly")

inline val IDBTransactionMode.Companion.readwrite: IDBTransactionMode
    get() = unsafeCast("readwrite")

inline val IDBTransactionMode.Companion.versionchange: IDBTransactionMode
    get() = unsafeCast("versionchange")
