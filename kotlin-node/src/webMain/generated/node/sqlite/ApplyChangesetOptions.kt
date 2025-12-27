// Automatically generated - do not modify!

package node.sqlite

sealed external interface ApplyChangesetOptions {
    /**
     * Skip changes that, when targeted table name is supplied to this function, return a truthy value.
     * By default, all changes are attempted.
     * @since v22.12.0
     */
    var filter: ((tableName: String) -> Boolean)?

    /**
     * A function that determines how to handle conflicts. The function receives one argument,
     * which can be one of the following values:
     *
     * * `SQLITE_CHANGESET_DATA`: A `DELETE` or `UPDATE` change does not contain the expected "before" values.
     * * `SQLITE_CHANGESET_NOTFOUND`: A row matching the primary key of the `DELETE` or `UPDATE` change does not exist.
     * * `SQLITE_CHANGESET_CONFLICT`: An `INSERT` change results in a duplicate primary key.
     * * `SQLITE_CHANGESET_FOREIGN_KEY`: Applying a change would result in a foreign key violation.
     * * `SQLITE_CHANGESET_CONSTRAINT`: Applying a change results in a `UNIQUE`, `CHECK`, or `NOT NULL` constraint
     * violation.
     *
     * The function should return one of the following values:
     *
     * * `SQLITE_CHANGESET_OMIT`: Omit conflicting changes.
     * * `SQLITE_CHANGESET_REPLACE`: Replace existing values with conflicting changes (only valid with
    `SQLITE_CHANGESET_DATA` or `SQLITE_CHANGESET_CONFLICT` conflicts).
     * * `SQLITE_CHANGESET_ABORT`: Abort on conflict and roll back the database.
     *
     * When an error is thrown in the conflict handler or when any other value is returned from the handler,
     * applying the changeset is aborted and the database is rolled back.
     *
     * **Default**: A function that returns `SQLITE_CHANGESET_ABORT`.
     * @since v22.12.0
     */
    var onConflict: ((conflictType: Number) -> Double)?
}
