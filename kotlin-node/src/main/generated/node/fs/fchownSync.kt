// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Sets the owner of the file. Returns `undefined`.
 *
 * See the POSIX [`fchown(2)`](http://man7.org/linux/man-pages/man2/fchown.2.html) documentation for more detail.
 * @since v0.4.7
 * @param uid The file's new owner's user id.
 * @param gid The file's new group's group id.
 */
external fun fchownSync(
    fd: Number,
    uid: Number,
    gid: Number,
)
