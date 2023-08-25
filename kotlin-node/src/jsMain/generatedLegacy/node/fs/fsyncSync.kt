// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * Request that all data for the open file descriptor is flushed to the storage
 * device. The specific implementation is operating system and device specific.
 * Refer to the POSIX [`fsync(2)`](http://man7.org/linux/man-pages/man2/fsync.2.html) documentation for more detail. Returns `undefined`.
 * @since v0.1.96
 */
external fun fsyncSync(
    fd: Number,
)
