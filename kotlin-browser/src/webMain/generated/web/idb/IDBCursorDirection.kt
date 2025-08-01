// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import js.reflect.unsafeCast

sealed external interface IDBCursorDirection {
    companion object
}

inline val IDBCursorDirection.Companion.next: IDBCursorDirection
    get() = unsafeCast("next")

inline val IDBCursorDirection.Companion.nextunique: IDBCursorDirection
    get() = unsafeCast("nextunique")

inline val IDBCursorDirection.Companion.prev: IDBCursorDirection
    get() = unsafeCast("prev")

inline val IDBCursorDirection.Companion.prevunique: IDBCursorDirection
    get() = unsafeCast("prevunique")
