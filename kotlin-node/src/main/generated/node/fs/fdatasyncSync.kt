// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Forces all currently queued I/O operations associated with the file to the
 * operating system's synchronized I/O completion state. Refer to the POSIX [`fdatasync(2)`](http://man7.org/linux/man-pages/man2/fdatasync.2.html) documentation for details. Returns `undefined`.
 * @since v0.1.96
 */
external fun fdatasyncSync(
    fd: Number,
)
