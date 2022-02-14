// Automatically generated - do not modify!

package node.fs

sealed external interface MakeDirectoryOptions {
    /**
     * Indicates whether parent folders should be created.
     * If a folder was created, the path to the first created folder will be returned.
     * @default false
     */
    var recursive: Boolean?

    /**
     * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
     * @default 0o777
     */
    var mode: Mode?
}
