// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction)
 */
@JsUnion
sealed /* union */
external interface IDBCursorDirection

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction#next)
 */
inline val IDBCursorDirection.Companion.next: IDBCursorDirection
    get() = unsafeCast("next")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction#nextunique)
 */
inline val IDBCursorDirection.Companion.nextunique: IDBCursorDirection
    get() = unsafeCast("nextunique")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction#prev)
 */
inline val IDBCursorDirection.Companion.prev: IDBCursorDirection
    get() = unsafeCast("prev")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction#prevunique)
 */
inline val IDBCursorDirection.Companion.prevunique: IDBCursorDirection
    get() = unsafeCast("prevunique")
