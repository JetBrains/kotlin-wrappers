// Automatically generated - do not modify!

package web.idb

import js.core.ReadonlyArray

/**
 * IDBIndex interface of the IndexedDB API provides asynchronous access to an index in a database. An index is a kind of object store for looking up records in another object store, called the referenced object store. You use this interface to retrieve data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex)
 */
sealed external class IDBIndex {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/keyPath) */
    val keyPath: Any /* string | string[] */

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/multiEntry) */
    val multiEntry: Boolean

    /**
     * Returns the name of the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/name)
     */
    var name: String

    /**
     * Returns the IDBObjectStore the index belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/objectStore)
     */
    val objectStore: IDBObjectStore

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/unique) */
    val unique: Boolean

    /**
     * Retrieves the number of records matching the given key or key range in query.
     *
     * If successful, request's result will be the count.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/count)
     */
    fun count(query: IDBValidKey = definedExternally): IDBRequest<Int>
    fun count(query: IDBKeyRange): IDBRequest<Int>

    /**
     * Retrieves the value of the first record matching the given key or key range in query.
     *
     * If successful, request's result will be the value, or undefined if there was no matching record.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/get)
     */
    operator fun get(query: IDBValidKey): IDBRequest<*>
    operator fun get(query: IDBKeyRange): IDBRequest<*>

    /**
     * Retrieves the values of the records matching the given key or key range in query (up to count if given).
     *
     * If successful, request's result will be an Array of the values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getAll)
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
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getAllKeys)
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
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getKey)
     */
    fun getKey(query: IDBValidKey): IDBRequest<IDBValidKey?>
    fun getKey(query: IDBKeyRange): IDBRequest<IDBValidKey?>

    /**
     * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in index are matched.
     *
     * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/openCursor)
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
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/openKeyCursor)
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
