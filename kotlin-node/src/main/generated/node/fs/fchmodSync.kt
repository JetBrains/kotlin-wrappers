// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Sets the permissions on the file. Returns `undefined`.
 *
 * See the POSIX [`fchmod(2)`](http://man7.org/linux/man-pages/man2/fchmod.2.html) documentation for more detail.
 * @since v0.4.7
 */
external fun fchmodSync(
    fd: Number,
    mode: Mode,
)
