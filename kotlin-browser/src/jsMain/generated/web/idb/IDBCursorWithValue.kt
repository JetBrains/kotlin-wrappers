// Automatically generated - do not modify!

package web.idb

/**
 * This IndexedDB API interface represents a cursor for traversing or iterating over multiple records in a database. It is the same as the IDBCursor, except that it includes the value property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue)
 */
sealed external class IDBCursorWithValue :
    IDBCursor {
    /**
     * Returns the cursor's current value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue/value)
     */
    val value: Any?
}
