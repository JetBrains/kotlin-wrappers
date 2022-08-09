// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import kotlinx.js.Void
import kotlin.js.Promise

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
): Promise<Void>
