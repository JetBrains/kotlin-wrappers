// Automatically generated - do not modify!

@file:JsModule("node:sqlite")

package node.sqlite

import js.promise.Promise
import node.fs.PathLike

/**
 * This method makes a database backup. This method abstracts the
 * [`sqlite3_backup_init()`](https://www.sqlite.org/c3ref/backup_finish.html#sqlite3backupinit),
 * [`sqlite3_backup_step()`](https://www.sqlite.org/c3ref/backup_finish.html#sqlite3backupstep)
 * and [`sqlite3_backup_finish()`](https://www.sqlite.org/c3ref/backup_finish.html#sqlite3backupfinish) functions.
 *
 * The backed-up database can be used normally during the backup process. Mutations coming from the same connection - same
 * `DatabaseSync` - object will be reflected in the backup right away. However, mutations from other connections will cause
 * the backup process to restart.
 *
 * ```js
 * import { backup, DatabaseSync } from 'node:sqlite';
 *
 * const sourceDb = new DatabaseSync('source.db');
 * const totalPagesTransferred = await backup(sourceDb, 'backup.db', {
 *   rate: 1, // Copy one page at a time.
 *   progress: ({ totalPages, remainingPages }) => {
 *     console.log('Backup in progress', { totalPages, remainingPages });
 *   },
 * });
 *
 * console.log('Backup completed', totalPagesTransferred);
 * ```
 * @since v23.8.0
 * @param sourceDb The database to backup. The source database must be open.
 * @param path The path where the backup will be created. If the file already exists,
 * the contents will be overwritten.
 * @param options Optional configuration for the backup. The
 * following properties are supported:
 * @returns A promise that fulfills with the total number of backed-up pages upon completion, or rejects if an
 * error occurs.
 */
@JsName("backup")
external fun backupAsync(
    sourceDb: DatabaseSync,
    path: PathLike,
    options: BackupOptions = definedExternally,
): Promise<Double>
