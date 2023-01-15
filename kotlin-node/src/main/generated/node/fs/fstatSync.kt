// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * Retrieves the `fs.Stats` for the file descriptor.
 *
 * See the POSIX [`fstat(2)`](http://man7.org/linux/man-pages/man2/fstat.2.html) documentation for more detail.
 * @since v0.1.95
 */
external fun fstatSync(
    fd: Number,
    options: StatOptions = definedExternally,
): Any /* Stats | BigIntStats */
