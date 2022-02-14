// Automatically generated - do not modify!

package node.fs

sealed external interface CopyOptions {
    /**
     * Dereference symlinks
     * @default false
     */
    var dereference: Boolean?

    /**
     * When `force` is `false`, and the destination
     * exists, throw an error.
     * @default false
     */
    var errorOnExist: Boolean?

    /**
     * Function to filter copied files/directories. Return
     * `true` to copy the item, `false` to ignore it.
     */
    val filter: ((
        source: String,
        destination: String,
    ) -> Boolean)?

    /**
     * Overwrite existing file or directory. _The copy
     * operation will ignore errors if you set this to false and the destination
     * exists. Use the `errorOnExist` option to change this behavior.
     * @default true
     */
    var force: Boolean?

    /**
     * When `true` timestamps from `src` will
     * be preserved.
     * @default false
     */
    var preserveTimestamps: Boolean?

    /**
     * Copy directories recursively.
     * @default false
     */
    var recursive: Boolean?
}
