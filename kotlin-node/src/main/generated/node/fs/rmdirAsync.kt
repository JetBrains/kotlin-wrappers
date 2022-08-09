// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import kotlinx.js.Void
import kotlin.js.Promise

/**
 * Removes the directory identified by `path`.
 *
 * Using `fsPromises.rmdir()` on a file (not a directory) results in the
 * promise being rejected with an `ENOENT` error on Windows and an `ENOTDIR`error on POSIX.
 *
 * To get a behavior similar to the `rm -rf` Unix command, use `fsPromises.rm()` with options `{ recursive: true, force: true }`.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("rmdir")
external fun rmdirAsync(
    path: PathLike,
    options: RmDirOptions = definedExternally,
): Promise<Void>
