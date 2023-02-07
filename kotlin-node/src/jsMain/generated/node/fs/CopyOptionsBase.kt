// Automatically generated - do not modify!

package node.fs

sealed external interface CopyOptionsBase {
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

    /**
     * When true, path resolution for symlinks will be skipped
     * @default false
     */
    var verbatimSymlinks: Boolean?
}
