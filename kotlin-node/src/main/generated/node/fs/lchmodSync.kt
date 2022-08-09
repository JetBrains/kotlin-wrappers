// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Changes the permissions on a symbolic link. Returns `undefined`.
 *
 * This method is only implemented on macOS.
 *
 * See the POSIX [`lchmod(2)`](https://www.freebsd.org/cgi/man.cgi?query=lchmod&sektion=2) documentation for more detail.
 * @deprecated Since v0.4.7
 */
external fun lchmodSync(
    path: PathLike,
    mode: Mode,
)
