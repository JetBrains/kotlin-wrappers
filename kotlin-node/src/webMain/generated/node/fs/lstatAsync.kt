// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

/**
 * Equivalent to `fsPromises.stat()` unless `path` refers to a symbolic link,
 * in which case the link itself is stat-ed, not the file that it refers to.
 * Refer to the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) document for more detail.
 * @since v10.0.0
 * @return Fulfills with the {fs.Stats} object for the given symbolic link `path`.
 */
@JsName("lstat")
external fun lstatAsync(
    path: PathLike,
    opts: LstatOpts = definedExternally,
): js.promise.Promise<Stats>

@JsName("lstat")
external fun lstatAsync(
    path: PathLike,
    opts: LstatBigIntOpts,
): js.promise.Promise<BigIntStats>

@JsName("lstat")
external fun lstatAsync(
    path: PathLike,
    opts: StatOptions = definedExternally,
): js.promise.Promise<Any /* Stats | BigIntStats */>

@JsName("lstat")
external fun lstatAsync(path: PathLike): js.promise.Promise<Stats>
