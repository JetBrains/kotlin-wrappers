// Automatically generated - do not modify!

@file:JsModule("node:sqlite")

package node.sqlite

import node.fs.PathLike

/**
 * This class represents a single [connection](https://www.sqlite.org/c3ref/sqlite3.html) to a SQLite database. All APIs
 * exposed by this class execute synchronously.
 * @since v22.5.0
 */
external class DatabaseSync : js.disposable.Disposable {
    /**
     * Constructs a new `DatabaseSync` instance.
     * @param path The path of the database.
     * A SQLite database can be stored in a file or completely [in memory](https://www.sqlite.org/inmemorydb.html).
     * To use a file-backed database, the path should be a file path.
     * To use an in-memory database, the path should be the special name `':memory:'`.
     * @param options Configuration options for the database connection.
     */
    constructor (path: PathLike, options: DatabaseSyncOptions = definedExternally)

    fun <T : SQLInputValue> aggregate(
        name: String,
        options: AggregateOptions<T>,
    )

    /**
     * Closes the database connection. An exception is thrown if the database is not
     * open. This method is a wrapper around [`sqlite3_close_v2()`](https://www.sqlite.org/c3ref/close.html).
     * @since v22.5.0
     */
    fun close()

    /**
     * Loads a shared library into the database connection. This method is a wrapper
     * around [`sqlite3_load_extension()`](https://www.sqlite.org/c3ref/load_extension.html). It is required to enable the
     * `allowExtension` option when constructing the `DatabaseSync` instance.
     * @since v22.13.0
     * @param path The path to the shared library to load.
     */
    fun loadExtension(path: String)

    /**
     * Enables or disables the `loadExtension` SQL function, and the `loadExtension()`
     * method. When `allowExtension` is `false` when constructing, you cannot enable
     * loading extensions for security reasons.
     * @since v22.13.0
     * @param allow Whether to allow loading extensions.
     */
    fun enableLoadExtension(allow: Boolean)

    /**
     * This method is a wrapper around [`sqlite3_db_filename()`](https://sqlite.org/c3ref/db_filename.html)
     * @since v24.0.0
     * @param dbName Name of the database. This can be `'main'` (the default primary database) or any other
     * database that has been added with [`ATTACH DATABASE`](https://www.sqlite.org/lang_attach.html) **Default:** `'main'`.
     * @returns The location of the database file. When using an in-memory database,
     * this method returns null.
     */
    fun location(dbName: String = definedExternally): String?

    /**
     * This method allows one or more SQL statements to be executed without returning
     * any results. This method is useful when executing SQL statements read from a
     * file. This method is a wrapper around [`sqlite3_exec()`](https://www.sqlite.org/c3ref/exec.html).
     * @since v22.5.0
     * @param sql A SQL string to execute.
     */
    fun exec(sql: String)

    /**
     * This method is used to create SQLite user-defined functions. This method is a
     * wrapper around [`sqlite3_create_function_v2()`](https://www.sqlite.org/c3ref/create_function.html).
     * @since v22.13.0
     * @param name The name of the SQLite function to create.
     * @param options Optional configuration settings for the function.
     * @param func The JavaScript function to call when the SQLite
     * function is invoked. The return value of this function should be a valid
     * SQLite data type: see
     * [Type conversion between JavaScript and SQLite](https://nodejs.org/docs/latest-v24.x/api/sqlite.html#type-conversion-between-javascript-and-sqlite).
     * The result defaults to `NULL` if the return value is `undefined`.
     */
    fun function(
        name: String,
        options: FunctionOptions,
        func: Function<SQLInputValue>, // (...args: SQLOutputValue[]) => SQLInputValue
    )

    fun function(name: String, func: Function<SQLInputValue> /* (...args: SQLOutputValue[]) => SQLInputValue */)

    /**
     * Sets an authorizer callback that SQLite will invoke whenever it attempts to
     * access data or modify the database schema through prepared statements.
     * This can be used to implement security policies, audit access, or restrict certain operations.
     * This method is a wrapper around [`sqlite3_set_authorizer()`](https://sqlite.org/c3ref/set_authorizer.html).
     *
     * When invoked, the callback receives five arguments:
     *
     * * `actionCode` {number} The type of operation being performed (e.g.,
     *   `SQLITE_INSERT`, `SQLITE_UPDATE`, `SQLITE_SELECT`).
     * * `arg1` {string|null} The first argument (context-dependent, often a table name).
     * * `arg2` {string|null} The second argument (context-dependent, often a column name).
     * * `dbName` {string|null} The name of the database.
     * * `triggerOrView` {string|null} The name of the trigger or view causing the access.
     *
     * The callback must return one of the following constants:
     *
     * * `SQLITE_OK` - Allow the operation.
     * * `SQLITE_DENY` - Deny the operation (causes an error).
     * * `SQLITE_IGNORE` - Ignore the operation (silently skip).
     *
     * ```js
     * import { DatabaseSync, constants } from 'node:sqlite';
     * const db = new DatabaseSync(':memory:');
     *
     * // Set up an authorizer that denies all table creation
     * db.setAuthorizer((actionCode) => {
     *   if (actionCode === constants.SQLITE_CREATE_TABLE) {
     *     return constants.SQLITE_DENY;
     *   }
     *   return constants.SQLITE_OK;
     * });
     *
     * // This will work
     * db.prepare('SELECT 1').get();
     *
     * // This will throw an error due to authorization denial
     * try {
     *   db.exec('CREATE TABLE blocked (id INTEGER)');
     * } catch (err) {
     *   console.log('Operation blocked:', err.message);
     * }
     * ```
     * @since v24.10.0
     * @param callback The authorizer function to set, or `null` to
     * clear the current authorizer.
     */
    fun setAuthorizer(
        callback: (
            (actionCode: Number, arg1: String?, arg2: String?, dbName: String?, triggerOrView: String?) -> Double
        )?,
    )

    /**
     * Whether the database is currently open or not.
     * @since v22.15.0
     */
    val isOpen: Boolean

    /**
     * Whether the database is currently within a transaction. This method
     * is a wrapper around [`sqlite3_get_autocommit()`](https://sqlite.org/c3ref/get_autocommit.html).
     * @since v24.0.0
     */
    val isTransaction: Boolean

    /**
     * Opens the database specified in the `path` argument of the `DatabaseSync`constructor. This method should only be used when the database is not opened via
     * the constructor. An exception is thrown if the database is already open.
     * @since v22.5.0
     */
    fun open()

    /**
     * Compiles a SQL statement into a [prepared statement](https://www.sqlite.org/c3ref/stmt.html). This method is a wrapper
     * around [`sqlite3_prepare_v2()`](https://www.sqlite.org/c3ref/prepare.html).
     * @since v22.5.0
     * @param sql A SQL string to compile to a prepared statement.
     * @return The prepared statement.
     */
    fun prepare(sql: String): StatementSync

    /**
     * Creates a new {@link SQLTagStore `SQLTagStore`}, which is an LRU (Least Recently Used) cache for
     * storing prepared statements. This allows for the efficient reuse of prepared
     * statements by tagging them with a unique identifier.
     *
     * When a tagged SQL literal is executed, the `SQLTagStore` checks if a prepared
     * statement for that specific SQL string already exists in the cache. If it does,
     * the cached statement is used. If not, a new prepared statement is created,
     * executed, and then stored in the cache for future use. This mechanism helps to
     * avoid the overhead of repeatedly parsing and preparing the same SQL statements.
     *
     * ```js
     * import { DatabaseSync } from 'node:sqlite';
     *
     * const db = new DatabaseSync(':memory:');
     * const sql = db.createTagStore();
     *
     * db.exec('CREATE TABLE users (id INT, name TEXT)');
     *
     * // Using the 'run' method to insert data.
     * // The tagged literal is used to identify the prepared statement.
     * sql.run`INSERT INTO users VALUES (1, 'Alice')`;
     * sql.run`INSERT INTO users VALUES (2, 'Bob')`;
     *
     * // Using the 'get' method to retrieve a single row.
     * const id = 1;
     * const user = sql.get`SELECT * FROM users WHERE id = ${id}`;
     * console.log(user); // { id: 1, name: 'Alice' }
     *
     * // Using the 'all' method to retrieve all rows.
     * const allUsers = sql.all`SELECT * FROM users ORDER BY id`;
     * console.log(allUsers);
     * // [
     * //   { id: 1, name: 'Alice' },
     * //   { id: 2, name: 'Bob' }
     * // ]
     * ```
     * @since v24.9.0
     * @param maxSize The maximum number of prepared statements to cache. **Default**: `1000`.
     * @returns A new SQL tag store for caching prepared statements.
     */
    fun createTagStore(maxSize: Number = definedExternally): SQLTagStore

    /**
     * Creates and attaches a session to the database. This method is a wrapper around
     * [`sqlite3session_create()`](https://www.sqlite.org/session/sqlite3session_create.html) and
     * [`sqlite3session_attach()`](https://www.sqlite.org/session/sqlite3session_attach.html).
     * @param options The configuration options for the session.
     * @returns A session handle.
     * @since v22.12.0
     */
    fun createSession(options: CreateSessionOptions = definedExternally): Session

    /**
     * An exception is thrown if the database is not
     * open. This method is a wrapper around
     * [`sqlite3changeset_apply()`](https://www.sqlite.org/session/sqlite3changeset_apply.html).
     *
     * ```js
     * import { DatabaseSync } from 'node:sqlite';
     *
     * const sourceDb = new DatabaseSync(':memory:');
     * const targetDb = new DatabaseSync(':memory:');
     *
     * sourceDb.exec('CREATE TABLE data(key INTEGER PRIMARY KEY, value TEXT)');
     * targetDb.exec('CREATE TABLE data(key INTEGER PRIMARY KEY, value TEXT)');
     *
     * const session = sourceDb.createSession();
     *
     * const insert = sourceDb.prepare('INSERT INTO data (key, value) VALUES (?, ?)');
     * insert.run(1, 'hello');
     * insert.run(2, 'world');
     *
     * const changeset = session.changeset();
     * targetDb.applyChangeset(changeset);
     * // Now that the changeset has been applied, targetDb contains the same data as sourceDb.
     * ```
     * @param changeset A binary changeset or patchset.
     * @param options The configuration options for how the changes will be applied.
     * @returns Whether the changeset was applied successfully without being aborted.
     * @since v22.12.0
     */
    fun applyChangeset(
        changeset: js.typedarrays.Uint8Array<*>,
        options: ApplyChangesetOptions = definedExternally,
    ): Boolean
}
