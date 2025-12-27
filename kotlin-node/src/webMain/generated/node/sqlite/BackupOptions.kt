// Automatically generated - do not modify!

package node.sqlite

sealed external interface BackupOptions {
    /**
     * Name of the source database. This can be `'main'` (the default primary database) or any other
     * database that have been added with [`ATTACH DATABASE`](https://www.sqlite.org/lang_attach.html)
     * @default 'main'
     */
    var source: String?

    /**
     * Name of the target database. This can be `'main'` (the default primary database) or any other
     * database that have been added with [`ATTACH DATABASE`](https://www.sqlite.org/lang_attach.html)
     * @default 'main'
     */
    var target: String?

    /**
     * Number of pages to be transmitted in each batch of the backup.
     * @default 100
     */
    var rate: Double?

    /**
     * An optional callback function that will be called after each backup step. The argument passed
     * to this callback is an `Object` with `remainingPages` and `totalPages` properties, describing the current progress
     * of the backup operation.
     */
    var progress: ((progressInfo: BackupProgressInfo) -> Unit)?
}
