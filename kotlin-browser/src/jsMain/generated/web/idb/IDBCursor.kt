// Automatically generated - do not modify!

package web.idb

import js.core.Void

sealed external class IDBCursor {
    /** Returns the direction ("next", "nextunique", "prev" or "prevunique") of the cursor. */
    val direction: IDBCursorDirection

    /** Returns the key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished. */
    val key: IDBValidKey

    /** Returns the effective key of the cursor. Throws a "InvalidStateError" DOMException if the cursor is advancing or is finished. */
    val primaryKey: IDBValidKey
    val request: IDBRequest<*>

    /** Returns the IDBObjectStore or IDBIndex the cursor was opened from. */
    val source: Any /* IDBObjectStore | IDBIndex */

    /** Advances the cursor through the next count records in range. */
    fun advance(count: Number)

    /** Advances the cursor to the next record in range. */
    fun `continue`(key: IDBValidKey = definedExternally)

    /** Advances the cursor to the next record in range matching or after key and primaryKey. Throws an "InvalidAccessError" DOMException if the source is not an index. */
    fun continuePrimaryKey(
        key: IDBValidKey,
        primaryKey: IDBValidKey,
    )

    /**
     * Delete the record pointed at by the cursor with a new value.
     *
     * If successful, request's result will be undefined.
     */
    fun delete(): IDBRequest<Void>

    /**
     * Updated the record pointed at by the cursor with a new value.
     *
     * Throws a "DataError" DOMException if the effective object store uses in-line keys and the key would have changed.
     *
     * If successful, request's result will be the record's key.
     */
    fun update(value: Any?): IDBRequest<IDBValidKey>
}
