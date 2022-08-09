// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Synchronously changes owner and group of a file. Returns `undefined`.
 * This is the synchronous version of {@link chown}.
 *
 * See the POSIX [`chown(2)`](http://man7.org/linux/man-pages/man2/chown.2.html) documentation for more detail.
 * @since v0.1.97
 */
external fun chownSync(
    path: PathLike,
    uid: Number,
    gid: Number,
)
