// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsInt
import js.core.JsString
import js.core.Void
import web.dom.DOMStringList
import kotlin.js.definedExternally

/**
 * The **`IDBObjectStore`** interface of the IndexedDB API represents an object store in a database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore)
 */
open external class IDBObjectStore
private constructor() {
    /**
     * The **`autoIncrement`** read-only property of the for this object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/autoIncrement)
     */
    val autoIncrement: Boolean

    /**
     * The **`indexNames`** read-only property of the in this object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/indexNames)
     */
    val indexNames: DOMStringList

    /**
     * The **`keyPath`** read-only property of the If this property is null, the application must provide a key for each modification operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/keyPath)
     */
    val keyPath: JsAny /* string | string[] */?

    /**
     * The **`name`** property of the IDBObjectStore interface indicates the name of this object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/name)
     */
    var name: String

    /**
     * The **`transaction`** read-only property of the object store belongs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/transaction)
     */
    val transaction: IDBTransaction

    /**
     * The **`add()`** method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread, creates a structured clone of the value, and stores the cloned value in the object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/add)
     */
    fun add(
        value: JsAny?,
        key: IDBValidKey = definedExternally,
    ): IDBRequest<IDBValidKey>

    /**
     * The **`clear()`** method of the IDBObjectStore interface creates and immediately returns an IDBRequest object, and clears this object store in a separate thread.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/clear)
     */
    fun clear(): IDBRequest<Void>

    /**
     * The **`count()`** method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread, returns the total number of records that match the provided key or of records in the store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/count)
     */
    fun count(query: IDBValidKey = definedExternally): IDBRequest<JsInt>
    fun count(query: IDBKeyRange): IDBRequest<JsInt>

    /**
     * The **`createIndex()`** method of the field/column defining a new data point for each database record to contain.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/createIndex)
     */
    fun createIndex(
        name: String,
        keyPath: String,
        options: IDBIndexParameters = definedExternally,
    ): IDBIndex

    fun createIndex(
        name: String,
        keyPath: ReadonlyArray<JsString>,
        options: IDBIndexParameters = definedExternally,
    ): IDBIndex

    /**
     * The **`delete()`** method of the and, in a separate thread, deletes the specified record or records.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/delete)
     */
    fun delete(query: IDBValidKey): IDBRequest<Void>
    fun delete(query: IDBKeyRange): IDBRequest<Void>

    /**
     * The **`deleteIndex()`** method of the the connected database, used during a version upgrade.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/deleteIndex)
     */
    fun deleteIndex(name: String)

    /**
     * The **`get()`** method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread, returns the object selected by the specified key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/get)
     */
    fun get(query: IDBValidKey): IDBRequest<*>
    fun get(query: IDBKeyRange): IDBRequest<*>

    /**
     * The **`getAll()`** method of the containing all objects in the object store matching the specified parameter or all objects in the store if no parameters are given.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/getAll)
     */
    fun getAll(
        query: IDBValidKey? = definedExternally,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    fun getAll(
        query: IDBKeyRange?,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    /**
     * The `getAllKeys()` method of the IDBObjectStore interface returns an IDBRequest object retrieves record keys for all objects in the object store matching the specified parameter or all objects in the store if no parameters are given.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/getAllKeys)
     */
    fun getAllKeys(
        query: IDBValidKey? = definedExternally,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    fun getAllKeys(
        query: IDBKeyRange?,
        count: Int = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    /**
     * The **`getKey()`** method of the and, in a separate thread, returns the key selected by the specified query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/getKey)
     */
    fun getKey(query: IDBValidKey): IDBRequest<IDBValidKey?>
    fun getKey(query: IDBKeyRange): IDBRequest<IDBValidKey?>

    /**
     * The **`index()`** method of the IDBObjectStore interface opens a named index in the current object store, after which it can be used to, for example, return a series of records sorted by that index using a cursor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/index)
     */
    fun index(name: String): IDBIndex

    /**
     * The **`openCursor()`** method of the and, in a separate thread, returns a new IDBCursorWithValue object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/openCursor)
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
     * The **`openKeyCursor()`** method of the whose result will be set to an IDBCursor that can be used to iterate through matching results.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/openKeyCursor)
     */
    fun openKeyCursor(
        query: IDBValidKey? = definedExternally,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursor?>

    fun openKeyCursor(
        query: IDBKeyRange?,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursor?>

    /**
     * The **`put()`** method of the IDBObjectStore interface updates a given record in a database, or inserts a new record if the given item does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/put)
     */
    fun put(
        value: JsAny?,
        key: IDBValidKey = definedExternally,
    ): IDBRequest<IDBValidKey>
}
