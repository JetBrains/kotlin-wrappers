@file:JsModule("node:fs")

package node.fs


/**
 * Sets the owner of the file. No arguments other than a possible exception are
 * given to the completion callback.
 *
 * See the POSIX [`fchown(2)`](http://man7.org/linux/man-pages/man2/fchown.2.html) documentation for more detail.
 * @since v0.4.7
 */
external fun fchown(fd: Number, uid: Number, gid: Number, callback: NoParamCallback): Unit
