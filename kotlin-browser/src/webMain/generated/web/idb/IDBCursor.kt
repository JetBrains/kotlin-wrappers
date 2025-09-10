// Automatically generated - do not modify!

package web.idb

import js.core.Void
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`IDBCursor`** interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records in a database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor)
 */
open external class IDBCursor
private constructor() {
    /**
     * The **`direction`** read-only property of the IDBCursor interface is a string that returns the direction of traversal of the cursor (set using IDBObjectStore.openCursor for example).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction)
     */
    val direction: IDBCursorDirection

    /**
     * The **`key`** read-only property of the IDBCursor interface returns the key for the record at the cursor's position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/key)
     */
    val key: IDBValidKey

    /**
     * The **`primaryKey`** read-only property of the IDBCursor interface returns the cursor's current effective key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/primaryKey)
     */
    val primaryKey: IDBValidKey

    /**
     * The **`request`** read-only property of the IDBCursor interface returns the IDBRequest used to obtain the cursor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/request)
     */
    val request: IDBRequest<*>

    /**
     * The **`source`** read-only property of the IDBCursor interface returns the IDBObjectStore or IDBIndex that the cursor is iterating over.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/source)
     */
    val source: JsAny /* IDBObjectStore | IDBIndex */

    /**
     * The **`advance()`** method of the IDBCursor interface sets the number of times a cursor should move its position forward.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/advance)
     */
    fun advance(count: Int)

    /**
     * The **`continue()`** method of the IDBCursor interface advances the cursor to the next position along its direction, to the item whose key matches the optional key parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continue)
     */
    fun `continue`(key: IDBValidKey = definedExternally)

    /**
     * The **`continuePrimaryKey()`** method of the IDBCursor interface advances the cursor to the item whose key matches the key parameter as well as whose primary key matches the primary key parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continuePrimaryKey)
     */
    fun continuePrimaryKey(
        key: IDBValidKey,
        primaryKey: IDBValidKey,
    )

    /**
     * The **`delete()`** method of the IDBCursor interface returns an IDBRequest object, and, in a separate thread, deletes the record at the cursor's position, without changing the cursor's position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/delete)
     */
    fun delete(): IDBRequest<Void>

    /**
     * The **`update()`** method of the IDBCursor interface returns an IDBRequest object, and, in a separate thread, updates the value at the current position of the cursor in the object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/update)
     */
    fun update(value: JsAny?): IDBRequest<IDBValidKey>
}
