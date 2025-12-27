// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * Set the owner for the path. Returns `undefined`.
 *
 * See the POSIX [`lchown(2)`](http://man7.org/linux/man-pages/man2/lchown.2.html) documentation for more details.
 * @param uid The file's new owner's user id.
 * @param gid The file's new group's group id.
 */
external fun lchownSync(
    path: PathLike,
    uid: Number,
    gid: Number,
)
