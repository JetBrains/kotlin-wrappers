// Automatically generated - do not modify!

package actions.glob

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GlobOptions {
    /**
     * Indicates whether to follow symbolic links. Generally should set to false
     * when deleting files.
     *
     * @default true
     */
    var followSymbolicLinks: Boolean?

    /**
     * Indicates whether directories that match a glob pattern, should implicitly
     * cause all descendant paths to be matched.
     *
     * For example, given the directory `my-dir`, the following glob patterns
     * would produce the same results: `my-dir/ **`, `my-dir/`, `my-dir`
     *
     * @default true
     */
    var implicitDescendants: Boolean?

    /**
     * Indicates whether matching directories should be included in the
     * result set.
     *
     * @default true
     */
    var matchDirectories: Boolean?

    /**
     * Indicates whether broken symbolic should be ignored and omitted from the
     * result set. Otherwise an error will be thrown.
     *
     * @default true
     */
    var omitBrokenSymbolicLinks: Boolean?
}
