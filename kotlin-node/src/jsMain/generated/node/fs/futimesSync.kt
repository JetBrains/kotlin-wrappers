// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

/**
 * Synchronous version of {@link futimes}. Returns `undefined`.
 * @since v0.4.2
 */
external fun futimesSync(fd: Number, atime: TimeLike, mtime: TimeLike): Unit
