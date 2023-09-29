@file:JsModule("node:fs")

package node.fs


/**
 * Creates a new link from the `existingPath` to the `newPath`. See the POSIX [`link(2)`](http://man7.org/linux/man-pages/man2/link.2.html) documentation for more detail. No arguments other than
 * a possible
 * exception are given to the completion callback.
 * @since v0.1.31
 */
external fun link(existingPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit
