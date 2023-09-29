@file:JsModule("node:fs")

package node.fs


/**
 * Changes the permissions on a symbolic link. No arguments other than a possible
 * exception are given to the completion callback.
 *
 * This method is only implemented on macOS.
 *
 * See the POSIX [`lchmod(2)`](https://www.freebsd.org/cgi/man.cgi?query=lchmod&sektion=2) documentation for more detail.
 * @deprecated Since v0.4.7
 */
external fun lchmod(path: PathLike, mode: Mode, callback: NoParamCallback): Unit
