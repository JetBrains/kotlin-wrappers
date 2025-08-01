// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.UInt53
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`IDBFactory`** interface of the IndexedDB API lets applications asynchronously access the indexed databases.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory)
 */
open external class IDBFactory
private constructor() {
    /**
     * The **`cmp()`** method of the IDBFactory interface compares two values as keys to determine equality and ordering for IndexedDB operations, such as storing and iterating.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/cmp)
     */
    fun cmp(
        first: JsAny?,
        second: JsAny?,
    ): Short

    /**
     * The **`databases`** method of the IDBFactory interface returns a Promise that fulfills with an array of objects containing the name and version of all the available databases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/databases)
     */
    @JsName("databases")
    fun databasesAsync(): Promise<ReadonlyArray<IDBDatabaseInfo>>

    /**
     * The **`deleteDatabase()`** method of the IDBFactory interface requests the deletion of a database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/deleteDatabase)
     */
    fun deleteDatabase(name: String): IDBOpenDBRequest

    /**
     * The **`open()`** method of the IDBFactory interface requests opening a connection to a database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/open)
     */
    fun open(
        name: String,
        version: UInt53 = definedExternally,
    ): IDBOpenDBRequest
}

/**
 * The **`databases`** method of the IDBFactory interface returns a Promise that fulfills with an array of objects containing the name and version of all the available databases.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/databases)
 */
suspend inline fun IDBFactory.databases(): ReadonlyArray<IDBDatabaseInfo> {
    return databasesAsync().await()
}
