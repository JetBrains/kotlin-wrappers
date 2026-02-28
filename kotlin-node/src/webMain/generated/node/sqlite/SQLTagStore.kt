// Automatically generated - do not modify!

package node.sqlite

/**
 * This class represents a single LRU (Least Recently Used) cache for storing
 * prepared statements.
 *
 * Instances of this class are created via the database.createTagStore() method,
 * not by using a constructor. The store caches prepared statements based on the
 * provided SQL query string. When the same query is seen again, the store
 * retrieves the cached statement and safely applies the new values through
 * parameter binding, thereby preventing attacks like SQL injection.
 *
 * The cache has a maxSize that defaults to 1000 statements, but a custom size can
 * be provided (e.g., database.createTagStore(100)). All APIs exposed by this
 * class execute synchronously.
 * @since v24.9.0
 */
sealed external interface SQLTagStore {
    /**
     * Executes the given SQL query and returns all resulting rows as an array of objects.
     * @since v24.9.0
     */
    fun all(
        stringElements: js.string.TemplateStringsArray,
        vararg boundParameters: SQLInputValue,
    ): js.array.ReadonlyArray<js.objects.ReadonlyRecord<String, SQLOutputValue>>

    /**
     * Executes the given SQL query and returns the first resulting row as an object.
     * @since v24.9.0
     */
    fun get(
        stringElements: js.string.TemplateStringsArray,
        vararg boundParameters: SQLInputValue,
    ): js.objects.ReadonlyRecord<String, SQLOutputValue>?

    /**
     * Executes the given SQL query and returns an iterator over the resulting rows.
     * @since v24.9.0
     */
    fun iterate(
        stringElements: js.string.TemplateStringsArray,
        vararg boundParameters: SQLInputValue,
    ): js.iterable.JsIterator<js.objects.ReadonlyRecord<String, SQLOutputValue>>

    /**
     * Executes the given SQL query, which is expected to not return any rows (e.g., INSERT, UPDATE, DELETE).
     * @since v24.9.0
     */
    fun run(
        stringElements: js.string.TemplateStringsArray,
        vararg boundParameters: SQLInputValue,
    ): StatementResultingChanges

    /**
     * A read-only property that returns the number of prepared statements currently in the cache.
     * @since v24.9.0
     * @returns The maximum number of prepared statements the cache can hold.
     */
    fun size(): Double

    /**
     * A read-only property that returns the maximum number of prepared statements the cache can hold.
     * @since v24.9.0
     */
    val capacity: Double

    /**
     * A read-only property that returns the `DatabaseSync` object associated with this `SQLTagStore`.
     * @since v24.9.0
     */
    val db: DatabaseSync

    /**
     * Resets the LRU cache, clearing all stored prepared statements.
     * @since v24.9.0
     */
    fun clear()
}
