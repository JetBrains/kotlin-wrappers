@file:JsModule("node:fs")

package node.fs


/**
 * Change the file system timestamps of the object referenced by `path`.
 *
 * The `atime` and `mtime` arguments follow these rules:
 *
 * * Values can be either numbers representing Unix epoch time in seconds,`Date`s, or a numeric string like `'123456789.0'`.
 * * If the value can not be converted to a number, or is `NaN`, `Infinity` or`-Infinity`, an `Error` will be thrown.
 * @since v0.4.2
 */
external fun utimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit
