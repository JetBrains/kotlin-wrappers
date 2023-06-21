// Automatically generated - do not modify!

package web.idb

import js.core.Void

sealed external class IDBCursor {
    /**
     * Returns the direction ("next", "nextunique", "prev" or "prevunique") of the cursor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction)
     */
    val direction: IDBCursorDirection

    /**
     * Returns the key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/key)
     */
    val key: IDBValidKey

    /**
     * Returns the effective key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/primaryKey)
     */
    val primaryKey: IDBValidKey
    val request: IDBRequest<*>

    /**
     * Returns the IDBObjectStore or IDBIndex the cursor was opened from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/source)
     */
    val source: Any /* IDBObjectStore | IDBIndex */

    /**
     * Advances the cursor through the next count records in range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/advance)
     */
    fun advance(count: Number)

    /**
     * Advances the cursor to the next record in range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continue)
     */
    fun `continue`(key: IDBValidKey = definedExternally)

    /**
     * Advances the cursor to the next record in range matching or after key and primaryKey. Throws an "InvalidAccessError" DOMException if the source is not an index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continuePrimaryKey)
     */
    fun continuePrimaryKey(
        key: IDBValidKey,
        primaryKey: IDBValidKey,
    )

    /**
     * Delete the record pointed at by the cursor with a new value.
     *
     * If successful, request's result will be undefined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/delete)
     */
    fun delete(): IDBRequest<Void>

    /**
     * Updated the record pointed at by the cursor with a new value.
     *
     * Throws a "DataError" DOMException if the effective object store uses in-line keys and the key would have changed.
     *
     * If successful, request's result will be the record's key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/update)
     */
    fun update(value: Any?): IDBRequest<IDBValidKey>
}
