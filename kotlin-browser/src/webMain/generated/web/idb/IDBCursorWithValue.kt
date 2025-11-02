// Automatically generated - do not modify!

package web.idb

import kotlin.js.JsAny

/**
 * The **`IDBCursorWithValue`** interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records in a database. It is the same as the IDBCursor, except that it includes the value property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue)
 */
open external class IDBCursorWithValue
private constructor() :
    IDBCursor {
    /**
     * The **`value`** read-only property of the IDBCursorWithValue interface returns the value of the current cursor, whatever that is.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue/value)
     */
    val value: JsAny?
}
