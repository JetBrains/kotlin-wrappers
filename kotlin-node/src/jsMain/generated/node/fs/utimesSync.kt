// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * Change the file system timestamps of the symbolic link referenced by `path`.
 * Returns `undefined`, or throws an exception when parameters are incorrect or
 * the operation fails. This is the synchronous version of {@link lutimes}.
 * @since v14.5.0, v12.19.0
 */
external fun utimesSync(
    path: PathLike,
    atime: TimeLike,
    mtime: TimeLike,
)
