// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.Void
import kotlin.js.Promise

/**
 * Creates a symbolic link.
 *
 * The `type` argument is only used on Windows platforms and can be one of `'dir'`,`'file'`, or `'junction'`. Windows junction points require the destination path
 * to be absolute. When using `'junction'`, the `target` argument will
 * automatically be normalized to absolute path.
 * @since v10.0.0
 * @param [type='file']
 * @return Fulfills with `undefined` upon success.
 */
@JsName("symlink")
external fun symlinkAsync(
    target: PathLike,
    path: PathLike,
    type: String? = definedExternally,
): Promise<Void>
