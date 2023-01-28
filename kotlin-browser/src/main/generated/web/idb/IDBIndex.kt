// Automatically generated - do not modify!

package web.idb

import js.core.ReadonlyArray

sealed external class IDBIndex {
    val keyPath: Any /* string | string[] */
    val multiEntry: Boolean

    /** Returns the name of the index. */
    var name: String

    /** Returns the IDBObjectStore the index belongs to. */
    val objectStore: IDBObjectStore
    val unique: Boolean

    /**
     * Retrieves the number of records matching the given key or key range in query.
     *
     * If successful, request's result will be the count.
     */
    fun count(query: IDBValidKey = definedExternally): IDBRequest<Int>
    fun count(query: IDBKeyRange): IDBRequest<Int>

    /**
     * Retrieves the value of the first record matching the given key or key range in query.
     *
     * If successful, request's result will be the value, or undefined if there was no matching record.
     */
    operator fun get(query: IDBValidKey): IDBRequest<*>
    operator fun get(query: IDBKeyRange): IDBRequest<*>

    /**
     * Retrieves the values of the records matching the given key or key range in query (up to count if given).
     *
     * If successful, request's result will be an Array of the values.
     */
    fun getAll(
        query: IDBValidKey? = definedExternally,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    fun getAll(
        query: IDBKeyRange?,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    /**
     * Retrieves the keys of records matching the given key or key range in query (up to count if given).
     *
     * If successful, request's result will be an Array of the keys.
     */
    fun getAllKeys(
        query: IDBValidKey? = definedExternally,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    fun getAllKeys(
        query: IDBKeyRange?,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    /**
     * Retrieves the key of the first record matching the given key or key range in query.
     *
     * If successful, request's result will be the key, or undefined if there was no matching record.
     */
    fun getKey(query: IDBValidKey): IDBRequest<IDBValidKey?>
    fun getKey(query: IDBKeyRange): IDBRequest<IDBValidKey?>

    /**
     * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in index are matched.
     *
     * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
     */
    fun openCursor(
        query: IDBValidKey? = definedExternally,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursorWithValue?>

    fun openCursor(
        query: IDBKeyRange?,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursorWithValue?>

    /**
     * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
     *
     * If successful, request's result will be an IDBCursor, or null if there were no matching records.
     */
    fun openKeyCursor(
        query: IDBValidKey? = definedExternally,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursor?>

    fun openKeyCursor(
        query: IDBKeyRange?,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursor?>
}
