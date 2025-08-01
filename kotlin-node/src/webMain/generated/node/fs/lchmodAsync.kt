// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Changes the permissions on a symbolic link.
 *
 * This method is only implemented on macOS.
 * @deprecated Since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */
@JsName("lchmod")
external fun lchmodAsync(
    path: PathLike,
    mode: Mode,
): Promise<js.core.Void>
