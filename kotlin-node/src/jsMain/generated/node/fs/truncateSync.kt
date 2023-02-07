// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * Truncates the file. Returns `undefined`. A file descriptor can also be
 * passed as the first argument. In this case, `fs.ftruncateSync()` is called.
 *
 * Passing a file descriptor is deprecated and may result in an error being thrown
 * in the future.
 * @since v0.8.6
 * @param [len=0]
 */
external fun truncateSync(
    path: PathLike,
    len: Number? = definedExternally,
)
