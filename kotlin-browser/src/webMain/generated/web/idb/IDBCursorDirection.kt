// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface IDBCursorDirection

inline val IDBCursorDirection.Companion.next: IDBCursorDirection
    get() = unsafeCast("next")

inline val IDBCursorDirection.Companion.nextunique: IDBCursorDirection
    get() = unsafeCast("nextunique")

inline val IDBCursorDirection.Companion.prev: IDBCursorDirection
    get() = unsafeCast("prev")

inline val IDBCursorDirection.Companion.prevunique: IDBCursorDirection
    get() = unsafeCast("prevunique")
