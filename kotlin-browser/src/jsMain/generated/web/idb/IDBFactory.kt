// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.core.JsLong
import js.promise.Promise
import seskar.js.JsAsync

/**
 * In the following code snippet, we make a request to open a database, and include handlers for the success and error cases. For a full working example, see our To-do Notifications app (view example live.)
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory)
 */
sealed external class IDBFactory {
    /**
     * Compares two values as keys. Returns -1 if key1 precedes key2, 1 if key2 precedes key1, and 0 if the keys are equal.
     *
     * Throws a "DataError" DOMException if either input is not a valid key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/cmp)
     */
    fun cmp(
        first: Any?,
        second: Any?,
    ): Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/databases)
     */
    @JsAsync
    suspend fun databases(): ReadonlyArray<IDBDatabaseInfo>

    @JsName("databases")
    fun databasesAsync(): Promise<ReadonlyArray<IDBDatabaseInfo>>

    /**
     * Attempts to delete the named database. If the database already exists and there are open connections that don't close in response to a versionchange event, the request will be blocked until all they close. If the request is successful request's result will be null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/deleteDatabase)
     */
    fun deleteDatabase(name: String): IDBOpenDBRequest

    /**
     * Attempts to open a connection to the named database with the current version, or 1 if it does not already exist. If the request is successful request's result will be the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/open)
     */
    fun open(
        name: String,
        version: JsLong = definedExternally,
    ): IDBOpenDBRequest
}
