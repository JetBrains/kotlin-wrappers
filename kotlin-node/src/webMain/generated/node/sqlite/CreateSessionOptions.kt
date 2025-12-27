// Automatically generated - do not modify!

package node.sqlite

sealed external interface CreateSessionOptions {
    /**
     * A specific table to track changes for. By default, changes to all tables are tracked.
     * @since v22.12.0
     */
    var table: String?

    /**
     * Name of the database to track. This is useful when multiple databases have been added using
     * [`ATTACH DATABASE`](https://www.sqlite.org/lang_attach.html).
     * @since v22.12.0
     * @default 'main'
     */
    var db: String?
}
