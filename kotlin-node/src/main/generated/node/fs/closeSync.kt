// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Closes the file descriptor. Returns `undefined`.
 *
 * Calling `fs.closeSync()` on any file descriptor (`fd`) that is currently in use
 * through any other `fs` operation may lead to undefined behavior.
 *
 * See the POSIX [`close(2)`](http://man7.org/linux/man-pages/man2/close.2.html) documentation for more detail.
 * @since v0.1.21
 */
external fun closeSync(
    fd: Number,
)
