// Automatically generated - do not modify!

package node.fs

sealed external interface RmDirOptions {
    /**
     * If an `EBUSY`, `EMFILE`, `ENFILE`, `ENOTEMPTY`, or
     * `EPERM` error is encountered, Node.js will retry the operation with a linear
     * backoff wait of `retryDelay` ms longer on each try. This option represents the
     * number of retries. This option is ignored if the `recursive` option is not
     * `true`.
     * @default 0
     */
    var maxRetries: Number?

    /**
     * @deprecated since v14.14.0 In future versions of Node.js and will trigger a warning
     * `fs.rmdir(path, { recursive: true })` will throw if `path` does not exist or is a file.
     * Use `fs.rm(path, { recursive: true, force: true })` instead.
     *
     * If `true`, perform a recursive directory removal. In
     * recursive mode, operations are retried on failure.
     * @default false
     */
    var recursive: Boolean?

    /**
     * The amount of time in milliseconds to wait between retries.
     * This option is ignored if the `recursive` option is not `true`.
     * @default 100
     */
    var retryDelay: Number?
}
