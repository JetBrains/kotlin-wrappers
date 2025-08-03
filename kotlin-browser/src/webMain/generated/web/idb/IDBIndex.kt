// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsInt
import kotlin.js.definedExternally

/**
 * `IDBIndex` interface of the IndexedDB API provides asynchronous access to an index in a database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex)
 */
open external class IDBIndex
private constructor() {
    /**
     * The **`keyPath`** property of the IDBIndex interface returns the key path of the current index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/keyPath)
     */
    val keyPath: JsAny /* string | string[] */

    /**
     * The **`multiEntry`** read-only property of the IDBIndex interface returns a boolean value that affects how the index behaves when the result of evaluating the index's key path yields an array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/multiEntry)
     */
    val multiEntry: Boolean

    /**
     * The **`name`** property of the IDBIndex interface contains a string which names the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/name)
     */
    var name: String

    /**
     * The **`objectStore`** property of the IDBIndex interface returns the object store referenced by the current index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/objectStore)
     */
    val objectStore: IDBObjectStore

    /**
     * The **`unique`** read-only property returns a boolean that states whether the index allows duplicate keys.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/unique)
     */
    val unique: Boolean

    /**
     * The **`count()`** method of the IDBIndex interface returns an IDBRequest object, and in a separate thread, returns the number of records within a key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/count)
     */
    fun count(query: IDBValidKey = definedExternally): IDBRequest<JsInt>
    fun count(query: IDBKeyRange): IDBRequest<JsInt>

    /**
     * The **`get()`** method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread, finds either the value in the referenced object store that corresponds to the given key or the first corresponding value, if `key` is set to an IDBKeyRange.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/get)
     */
    fun get(query: IDBValidKey): IDBRequest<*>
    fun get(query: IDBKeyRange): IDBRequest<*>

    /**
     * The **`getAll()`** method of the IDBIndex interface retrieves all objects that are inside the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getAll)
     */
    fun getAll(
        queryOrOptions: IDBValidKey? = definedExternally,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    fun getAll(
        queryOrOptions: IDBKeyRange?,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    /**
     * The **`getAllKeys()`** method of the IDBIndex interface asynchronously retrieves the primary keys of all objects inside the index, setting them as the `result` of the request object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getAllKeys)
     */
    fun getAllKeys(
        queryOrOptions: IDBValidKey? = definedExternally,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    fun getAllKeys(
        queryOrOptions: IDBKeyRange?,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    /**
     * The **`getKey()`** method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread, finds either the primary key that corresponds to the given key in this index or the first corresponding primary key, if `key` is set to an IDBKeyRange.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getKey)
     */
    fun getKey(query: IDBValidKey): IDBRequest<IDBValidKey?>
    fun getKey(query: IDBKeyRange): IDBRequest<IDBValidKey?>

    /**
     * The **`openCursor()`** method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread, creates a cursor over the specified key range.
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
     * The **`openKeyCursor()`** method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread, creates a cursor over the specified key range, as arranged by this index.
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
