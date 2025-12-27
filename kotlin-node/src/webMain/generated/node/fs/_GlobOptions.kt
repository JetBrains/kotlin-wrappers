// Automatically generated - do not modify!

package node.fs

// TODO: collapse
sealed external interface _GlobOptions<T : Any /* Dirent | string */> {
    /**
     * Current working directory.
     * @default process.cwd()
     */
    var cwd: Any? // string | URL | undefined

    /**
     * `true` if the glob should return paths as `Dirent`s, `false` otherwise.
     * @default false
     * @since v22.2.0
     */
    var withFileTypes: Boolean?

    /**
     * Function to filter out files/directories or a
     * list of glob patterns to be excluded. If a function is provided, return
     * `true` to exclude the item, `false` to include it.
     * If a string array is provided, each string should be a glob pattern that
     * specifies paths to exclude. Note: Negation patterns (e.g., '!foo.js') are
     * not supported.
     * @default undefined
     */
    var exclude: Any? // ((fileName: T) => boolean) | readonly string[] | undefined
}
