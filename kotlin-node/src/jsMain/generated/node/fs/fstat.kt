@file:JsModule("node:fs")

package node.fs


/**
 * Invokes the callback with the `fs.Stats` for the file descriptor.
 *
 * See the POSIX [`fstat(2)`](http://man7.org/linux/man-pages/man2/fstat.2.html) documentation for more detail.
 * @since v0.1.95
 */
external fun fstat(fd: Number, callback: (err: node.ErrnoException?, stats: Stats) -> Unit): Unit

external fun fstat(
    fd: Number,
    options: (FstatOptions)?,
    callback: (err: node.ErrnoException?, stats: Stats) -> Unit,
): Unit

external fun fstat(
    fd: Number,
    options: FstatBigIntOptions,
    callback: (err: node.ErrnoException?, stats: BigIntStats) -> Unit,
): Unit

external fun fstat(
    fd: Number,
    options: StatOptions?,
    callback: (err: node.ErrnoException?, stats: Any /* Stats | BigIntStats */) -> Unit,
): Unit
